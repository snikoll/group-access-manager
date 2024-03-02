package com.snikoll.groupaccessmanager.service;

import com.snikoll.groupaccessmanager.adapter.AcessoAdapter;
import com.snikoll.groupaccessmanager.domain.Acesso;
import com.snikoll.groupaccessmanager.domain.Role;
import com.snikoll.groupaccessmanager.domain.TipoAcesso;
import com.snikoll.groupaccessmanager.domain.enumerations.RoleAcesso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AcessoService {

    private final AcessoAdapter acessoAdapter;

    @Autowired
    public AcessoService(AcessoAdapter acessoAdapter) {
        this.acessoAdapter = acessoAdapter;
    }

    public List<Acesso> obterAcessos(List<String> userRoles) throws IOException {
        List<Role> roles = acessoAdapter.obterRolesFromProperties();
        System.out.println("Lista de roles em sistema: " + roles);
        System.out.println("Lista de roles em que o usuario possui: " + userRoles);

        return
        // getAcessosByRoles(userRoles, roles);
        getAcessosByRoleAcesso(userRoles);
    }


    // Criar regra para pegar o final da role pelo ambiente;
    // Criar regra para não precisar passar o accessType;
    // Criar regra para predominar o acesso de editor;
    private List<Acesso> getAcessosByRoles(List<String> userRoles, List<Role> roles){
        List<Acesso> acessosPermitidos = new ArrayList<>();

        for (String userRole : userRoles){
            roles.stream().filter(acessRole -> userRole.equals(acessRole.getRoleName()))
                    .findAny()
                    .ifPresent(acessRole -> acessosPermitidos.add(new Acesso(acessRole.getAccessName(), acessRole.getAccessType())));
        }

        System.out.println("Acessos permitidos: " + acessosPermitidos);
        return acessosPermitidos;
    }
    private List<Acesso> getAcessosByRoleAcesso(List<String> userRoles) {
        List<Acesso> acessosPermitidos = new ArrayList<>();

        for (RoleAcesso accessRole : RoleAcesso.values()) {
            if (userRoles.stream().anyMatch(userRole -> userRole.equals(accessRole.name().toLowerCase()))) {
                TipoAcesso tipoAcesso = accessRole.name().contains("EDITOR") ? TipoAcesso.EDITOR : TipoAcesso.LEITURA;
                acessosPermitidos.add(new Acesso(accessRole.getAccessName(), tipoAcesso));
            }
        }

        System.out.println("Acessos permitidos: " + acessosPermitidos);
        return acessosPermitidos;
    }
}
