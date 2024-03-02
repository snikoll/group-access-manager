package com.snikoll.groupaccessmanager.domain;

public class Acesso {
    private String accessName;
    private TipoAcesso accessType;

    // Construtores
    public Acesso() {
    }

    public Acesso(String accessName, TipoAcesso accessType) {
        this.accessName = accessName;
        this.accessType = accessType;
    }

    // Getters e Setters
    public String getAccessName() {
        return accessName;
    }

    public void setAccessName(String accessName) {
        this.accessName = accessName;
    }

    public TipoAcesso getAccessType() {
        return accessType;
    }

    public void setAccessType(TipoAcesso accessType) {
        this.accessType = accessType;
    }

    @Override
    public String toString() {
        return "Acesso{" +
                "accessName='" + accessName + '\'' +
                ", accessType=" + accessType +
                '}';
    }
}
