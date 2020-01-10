package com.pigmo.spbackend.pojo;

import com.pigmo.spbackend.enums.UserTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Users implements Serializable {

    private static final long serialVersionUID = 6621842205056803334L;

    /**
     * 用户id
     */
    private Long id;
    /**
     * 用户唯一标识码
     */
    private String userid;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPwd;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 邮件地址
     */
    private String email;
    /**
     * 用户状态
     */
    private Integer status;
    /**
     * 用户类型
     */
    private UserTypeEnum userType;
    /**
     * 创建时间
     */
    private Date ctime;
    /**
     * 修改时间
     */
    private Date mtime;
    /**
     * 附加信息
     */
    private UserExt userExt;
}
