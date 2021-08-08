package com.wystu.vueblog.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author WY
 * @description: JwtToken
 * @date 2021/8/8 23:11
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
