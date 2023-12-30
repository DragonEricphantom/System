package com.example.WebApi;

import com.example.WebApi.JWT.JwtUnit;
import com.example.WebApi.dao.Entity.ArticleEntity;
import com.example.WebApi.dao.Entity.User;
import com.example.WebApi.dao.repository.ArticleRepository;
import com.example.WebApi.dao.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


//@CrossOrigin(origins = "http://localhost:5500")
@CrossOrigin
@RestController
public class router {
    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    ResData resData;

    @Autowired
    private JwtUnit jwtUtil;

    @GetMapping("/getData")
    public ResData getData(@RequestHeader("Authorization") String token, @RequestParam(name = "page", defaultValue = "0") int thepage) {
        resData = myEndpoint(token);
        if (!resData.isTokenIsUsed()) {
            return resData;
        }
        Pageable pageable = PageRequest.of(thepage, 10, Sort.by("ID").ascending());
        Page<ArticleEntity> page = articleRepository.findAll(pageable);
        resData.setDataList(page.getContent());
        resData.setStatus(true);
        resData.setMessage("Get Articles!");
        resData.setHasNext(String.valueOf(page.hasNext()));
        resData.setHasPre(String.valueOf(page.hasPrevious()));
        resData.setCurrentPage(String.valueOf(thepage));
        resData.setTotalPages(String.valueOf(page.getTotalPages()));
        return resData;
    }

    @GetMapping("/searchData")
    public ResData searchData(@RequestHeader("Authorization") String token, @RequestParam(name = "title") String thetitle) {
        resData = myEndpoint(token);
        if (!resData.isTokenIsUsed()) {
            return resData;
        }
        List<ArticleEntity> ListEntity = articleRepository.findByTITLEContainingIgnoreCase(thetitle);
        resData.setDataList(ListEntity);
        return resData;
    }

    @GetMapping("/getArticle")
    public ResData getgetArticle(@RequestHeader("Authorization") String token, @RequestParam(name = "title") String thetitle) {
        resData = myEndpoint(token);
        if (!resData.isTokenIsUsed()) {
            return resData;
        }
        Optional<ArticleEntity> Entity = articleRepository.findByTITLE(thetitle);
        resData.setData(Entity.get());
        return resData;
    }

    @GetMapping("/checkArticleTitle")
    public ResData checkArticleTitle(@RequestHeader("Authorization") String token, @RequestParam(name = "title") String title) {
        System.out.println("In checkArticle Title" + title);
        resData = myEndpoint(token);
        if (!resData.isTokenIsUsed()) {
            return resData;
        }
        Optional<ArticleEntity> Data = articleRepository.findByTITLE(title);
        if (Data.isPresent()) {
            resData.setMessage("Title is exist");
            resData.setStatus(false);
        } else {
            resData.setMessage("Title is not Used");
            resData.setStatus(true);
        }
        return resData;
    }

    @GetMapping("/products/{id}")
    ResData one(@RequestHeader("Authorization") String token, @PathVariable Integer id) {
        resData = myEndpoint(token);
        if (!resData.isTokenIsUsed()) {
            return resData;
        }
        ArticleEntity Data = articleRepository.findByID(id);
        resData.setData(Data);
        return resData;
    }

    @SneakyThrows
    @PostMapping("/products")
    public ResData SetPost(@RequestHeader("Authorization") String token, @RequestBody String str) {
        resData = myEndpoint(token);
        if (!resData.isTokenIsUsed()) {
            return resData;
        }
        ArticleEntity entity = objectMapper.readValue(str, ArticleEntity.class);

        if (str.isEmpty()) {
            resData.setMessage("the data is empty");
            resData.setStatus(false);
            return resData;
        } else {
            resData.setMessage("Get new Article");
            resData.setStatus(true);
            Optional<ArticleEntity> getId = articleRepository.findTopByOrderByIDDesc();
            Integer id = getId.get().getID() + 1;
            entity.setID(id);
            articleRepository.save(entity);
            return resData;
        }
    }

    @SneakyThrows
    @PatchMapping("/update")
    public ResData update(@RequestHeader("Authorization") String token, @RequestBody String str) {
        resData = myEndpoint(token);
        if (!resData.isTokenIsUsed()) {
            return resData;
        }
        ArticleEntity entity = objectMapper.readValue(str, ArticleEntity.class);
        System.out.println("Update Entity:" + entity);
        ArticleEntity FindEntity = articleRepository.findByID(entity.getID());
        ArticleEntity OldEntity;

        if (!FindEntity.equals(null)) {
            OldEntity = FindEntity;
        } else {
            System.out.println("Not Find ID");
            resData.setMessage("the data is empty");
            resData.setStatus(false);
            return resData;
        }

        copyPropertiesIgnoreNull(entity, OldEntity);

        resData.setMessage("Fix Article");
        resData.setStatus(true);
        articleRepository.save(OldEntity);
        return resData;

    }

    @SneakyThrows
    @PostMapping("/logInfo")
    public Object TestcheckName(@RequestBody User theuser) {
        User User = userRepository.findByUSERNAME(theuser.getUSERNAME());
        if (User != null) {
            System.out.println("user:" + User);
            String password = User.getPASSWORD();
            if (theuser.getPASSWORD().equals(password)) {
                resData.setMessage("log in finish");
                resData.setStatus(true);
                //(String username, String Identify, String PhoneNumber, String Brithday)
                String jwtToken = jwtUtil.generateJwtToken(theuser.getUSERNAME(), theuser.getIDENTIFY(), theuser.getPHONENUMBER(), theuser.getBIRTHDAY());
                Map<String, String> token = new HashMap<>();
                token.put("token", jwtToken);

                System.out.println("token:" + token);
                resData.setJwt(token);

                return resData;
            } else {
                resData.setMessage("Count or password is fail");
                resData.setStatus(false);
                return resData;
            }
        } else {
            resData.setMessage("Not user name");
            resData.setStatus(false);
            return resData;
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResData delete(@RequestHeader("Authorization") String token, @PathVariable Integer id) {
        resData = myEndpoint(token);
        if (!resData.isTokenIsUsed()) {
            return resData;
        }
        System.out.println("id:" + id);
        articleRepository.deleteById(id);
        resData.setMessage("刪除成功");
        return resData;
    }

    public static void copyPropertiesIgnoreNull(Object source, Object target) {
        BeanWrapper src = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        // 获取source中值为null的属性名
        String[] nullPropertyNames = getNullPropertyNames(source);
        BeanUtils.copyProperties(source, target, nullPropertyNames);
    }

    private static String[] getNullPropertyNames(Object source) {
        BeanWrapper src = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        String[] names = new String[pds.length];
        int count = 0;
        for (PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) {
                names[count++] = pd.getName();
            }
        }
        String[] result = new String[count];
        System.arraycopy(names, 0, result, 0, count);
        return result;
    }

    public ResData myEndpoint(String token) {
        if (token != null && token.startsWith("Bearer")) {
            String actualToken = token.substring(6);
            System.out.println("get token:" + actualToken);
            resData = jwtUtil.parseJwt(actualToken);
        }
        return resData;
    }

}


