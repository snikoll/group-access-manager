package com.snikoll.groupaccessmanager.gateway;

import com.snikoll.groupaccessmanager.domain.Role;

import java.io.IOException;
import java.util.List;

public interface AcessoGateway {
    List<Role> obterRolesFromProperties() throws IOException;
}
