package project;

import org.junit.Test;

import com.wq.sbp.common.util.JWTUtil;

import io.jsonwebtoken.Claims;

public class T {
    @Test
    public void test(){
        
    }
    public static void main(String[] args) {
        String token="eyJhbGciOiJIUzUxMiJ9.eyJleHAiOjE1MDQ0ODY2MDQsIm1lbWJlcklkIjo0NDV9.CirDHxQvJa_XuF8oM2jD52ctxy88ILLrOUfeamNuZ30f4hGilVVXXWrAsf3RJcaC1w_jVnTjIfh9ITGvBZ1k9Q";
        Claims c=JWTUtil.getClaimsFromToken(token);
        System.out.println(c.get("memberId"));
    }
}
