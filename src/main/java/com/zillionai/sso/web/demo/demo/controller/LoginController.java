package com.zillionai.sso.web.demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zangk
 * @Description //登录控制类
 * @Date 2020/6/24 13:57
 * @Param
 * @return
 **/
@RestController
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "qingdao";
    }

    @GetMapping("/")
    public String index() {
        return "login";
    }

    @PostMapping("/test")
    public CloudwalkResult notifyDevice(@RequestBody Pram notifyDeviceParam) {
        System.out.println("test param :" + notifyDeviceParam);
        System.out.println("test return :" + notifyDeviceParam);
        return CloudwalkResult.success(notifyDeviceParam);
    }

}
