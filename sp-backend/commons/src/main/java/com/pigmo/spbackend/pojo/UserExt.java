package com.pigmo.spbackend.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserExt implements Serializable {

    private static final long serialVersionUID = 4466294931257926109L;

    /**
     * 主id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 省
     */
    private Integer province;
    /**
     * 市
     */
    private Integer city;
    /**
     * 区
     */
    private Integer district;
    /**
     * 个人描述
     */
    private String description;
}
