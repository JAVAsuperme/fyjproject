package com.fyj.demo.controller;

import com.fyj.demo.dto.User;
import com.fyj.demo.service.UserService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户模块Controller
 */
@Controller
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password) {

        boolean loginFlag = userService.login(username, password);

        if (loginFlag) {
            return "登陆成功";
        } else {
            return "用户名或密码错误";
        }

    }
}
