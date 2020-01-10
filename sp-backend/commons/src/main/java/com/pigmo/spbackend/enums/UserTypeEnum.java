package com.pigmo.spbackend.enums;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public enum UserTypeEnum {
    NORMAL(0,"普通用户"),
    ADMIN(1,"管理员");

    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String name;

    UserTypeEnum(Integer id,String name){
        this.id = id;
        this.name = name;
    }

}
