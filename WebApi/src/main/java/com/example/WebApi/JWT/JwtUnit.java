package com.example.WebApi.JWT;

import com.example.WebApi.ResData;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;

@Component
public class JwtUnit {
    @Autowired
    ResData resData;

    private static String SECRET_KEY = generateRandomSHA256Key();

    public ResData parseJwt(String jwtToken) {
        try {
//            System.out.println("Check Secret_Key:" + SECRET_KEY);
//            System.out.println("parseJwt:" + jwtToken);
            Jws<Claims> claimsJws = Jwts.parserBuilder()
                    .setSigningKey(SECRET_KEY.getBytes())
                    .build()
                    .parseClaimsJws(jwtToken);

            resData.setTokenIsUsed(true);
            return resData;  // Token 是有效的

        } catch (JwtException e) {
            // 无效的 JWT
//            throw new RuntimeException("Invalid JWT token", e);
            resData.setTokenIsUsed(false);
            return resData;  // Token 是有效的
        }
    }

    public String generateJwtToken(String username, String Identify, String PhoneNumber, String Birthday) {
        System.out.println("Generate secure Key:" + SECRET_KEY);
        return Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1800000))  //1800000  30分鐘後过期
                .claim("Identify", Identify)
                .claim("PhoneNumber", PhoneNumber)
                .claim("Birthday", Birthday)
                .claim("UserName", username)
                .signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()))
                .compact();
    }

    public static String generateRandomSHA256Key() {
        SecureRandom random = new SecureRandom();
        byte[] keyBytes = new byte[32];
        random.nextBytes(keyBytes);
        System.out.println("Security Key:" + String.format("%064x", new BigInteger(1, keyBytes)));
        return String.format("%064x", new BigInteger(1, keyBytes));  // 将字节转换为 HEX 格式
    }


}
