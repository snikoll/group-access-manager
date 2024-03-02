package com.snikoll.groupaccessmanager.domain;

public enum TipoAcesso {
    LEITURA("Leitura"),
    EDITOR("Editor");

    private final String descricao;

    TipoAcesso(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "TipoAcesso{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
