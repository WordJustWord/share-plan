package com.pigmo.sp.userservice.service;

import com.pigmo.spbackend.apis.UserApi;
import com.pigmo.spbackend.pojo.Users;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service(version = "${user-service.version}")
public class UserService implements UserApi {
    @Override
    public String test() {
        return "Hello i am work";
    }

    @Override
    public List<Users> getUserList() {
        return null;
    }
}
