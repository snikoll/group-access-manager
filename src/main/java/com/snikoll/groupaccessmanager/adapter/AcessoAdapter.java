package com.snikoll.groupaccessmanager.adapter;

import com.google.gson.Gson;
import com.snikoll.groupaccessmanager.domain.Role;
import com.snikoll.groupaccessmanager.gateway.AcessoGateway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
import java.io.IOException;


@Component
public class AcessoAdapter implements AcessoGateway {

    @Value("${roles}")
    private String rolesList;

    @Override
    public List<Role> obterRolesFromProperties() throws IOException {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Role>>() {}.getType();
        return gson.fromJson(rolesList, listType);
    }
}
