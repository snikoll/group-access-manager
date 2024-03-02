package com.snikoll.groupaccessmanager.domain;

public class Role {

    private String roleName;
    private String accessName;
    private TipoAcesso accessType;

    // Construtor padrão
    public Role() {
    }

    // Construtor com parâmetros
    public Role(String roleName, String accessName, TipoAcesso accessType) {
        this.roleName = roleName;
        this.accessName = accessName;
        this.accessType = accessType;
    }

    // Getters e Setters

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

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
        return "Role{" +
                "roleName='" + roleName + '\'' +
                ", accessName='" + accessName + '\'' +
                ", accessType=" + accessType +
                '}';
    }
}
