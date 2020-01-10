package com.pigmo.spbackend.apis;

import com.pigmo.spbackend.pojo.Users;

import java.util.List;

public interface UserApi {
    String test();
    List<Users> getUserList();
}
