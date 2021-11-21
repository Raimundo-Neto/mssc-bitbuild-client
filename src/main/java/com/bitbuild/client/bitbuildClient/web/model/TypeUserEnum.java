package com.bitbuild.client.bitbuildClient.web.model;

public enum TypeUserEnum {

    USER_ADMIN(1),
    USER_UNVERIFIED(2),
    USER_VERIFIED(3);

    private Integer id;

    TypeUserEnum(Integer id){
        this.id = id;
    }

    public  Integer getValue(){
        return  this.id;
    }

}
