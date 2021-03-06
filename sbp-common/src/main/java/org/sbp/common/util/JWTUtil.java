package org.sbp.common.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTUtil {

    private static String secret = "zwq";

    @Test
    public void test() {
        Map<String, Object> map = new HashMap<>();
        map.put("memberId", 1);
        String result = generateToken(map);
        String result1 = generateToken(map);
        System.out.println(result.equals(result1));
        Claims cl = getClaimsFromToken(result);
        System.out.println(cl.get("memberId"));
    }
    
    public static String generateToken(Map<String, Object> claims) {

        return Jwts.builder().setClaims(claims).setExpiration(DateUtils.addDays(new Date(), 7))
                .signWith(SignatureAlgorithm.HS512, Base64.encodeBase64String(secret.getBytes())).compact();
    }

    public static Claims getClaimsFromToken(String token) {
        Claims claims = Jwts.parser().setSigningKey(Base64.encodeBase64String(secret.getBytes())).parseClaimsJws(token).getBody();
        return claims;
    }

}
