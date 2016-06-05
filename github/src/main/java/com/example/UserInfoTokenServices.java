package com.example;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by m91snik on 04.06.16.
 */
public class UserInfoTokenServices extends org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices {

    public UserInfoTokenServices(String userInfoEndpointUrl, String clientId) {
        super(userInfoEndpointUrl, clientId);
    }

    @Override
    protected Object getPrincipal(Map<String, Object> map) {
        return super.getPrincipal(map);
    }
}
