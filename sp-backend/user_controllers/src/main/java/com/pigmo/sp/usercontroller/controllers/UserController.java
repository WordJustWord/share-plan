package com.pigmo.sp.usercontroller.controllers;

import com.pigmo.spbackend.apis.UserApi;
import com.pigmo.spbackend.utils.NormalResult;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Reference(version = "${user-controller.version}")
    private UserApi userApi;

    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public NormalResult test(){
        String res = userApi.test();
        return NormalResult.ok("测试成功",res);
    }
}
