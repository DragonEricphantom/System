package com.example.WebApi;

import com.example.WebApi.dao.Entity.ArticleEntity;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Data
public class ResData {
    private String Message;
    private List<ArticleEntity> DataList;
    private ArticleEntity Data;
    private Boolean status;
    private String hasPre;
    private String prePage;
    private String currentPage;
    private String hasNext;
    private String totalPages;

    private Map<String, String> jwt;
    private boolean TokenIsUsed;


}
