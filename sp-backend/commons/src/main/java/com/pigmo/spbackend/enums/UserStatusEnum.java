package com.pigmo.spbackend.enums;

import lombok.Getter;
import lombok.Setter;

public enum UserStatusEnum {
    NONEACTIVE(0,"未激活"),
    ACTIVED(1,"已激活"),
    CANCEL(2,"已注销");

    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String name;

    UserStatusEnum(Integer id,String name){
        this.id = id;
        this.name = name;
    }
}
