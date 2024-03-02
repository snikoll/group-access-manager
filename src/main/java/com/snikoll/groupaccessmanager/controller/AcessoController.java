package com.snikoll.groupaccessmanager.controller;

import com.snikoll.groupaccessmanager.domain.Acesso;
import com.snikoll.groupaccessmanager.service.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class AcessoController {

    private final AcessoService acessoService;

    @Autowired
    public AcessoController(AcessoService acessoService) {
        this.acessoService = acessoService;
    }

    @GetMapping("/obter-acessos")
    public List<Acesso> obterAcessos(@RequestBody List<String> roles) throws IOException {
        return acessoService.obterAcessos(roles);
    }
}
