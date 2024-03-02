package com.snikoll.groupaccessmanager.domain.enumerations;

public enum RoleAcesso {
    CONTEXTO1_ACESSO_EDITOR_ROLE("context1_access"),
    CONTEXTO1_ACESSO_LEITURA_ROLE( "context1_access"),
    CONTEXTO2_ACESSO_EDITOR_ROLE( "context2_access"),
    CONTEXTO2_ACESSO_LEITURA_ROLE( "context2_access");

    private final String accessName;

    RoleAcesso( String accessName) {
        this.accessName = accessName;
    }

    public String getAccessName() {
        return accessName;
    }
}
