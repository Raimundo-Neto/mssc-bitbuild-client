package com.bitbuild.client.bitbuildClient.web.model;

public enum StatusUserEnum {

    USER_ACTIVE(1),
    USER_INATIVE(2),
    USER_BLOCKED(3);

    protected Integer id;

    StatusUserEnum(Integer id){
        this.id = id;
    }

    public  Integer getValue(){
        return  this.id;
    }

}
