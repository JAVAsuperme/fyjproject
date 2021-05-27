package com.fyj.demo.controller;

import com.fyj.demo.dto.User;
import com.fyj.demo.service.UserService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/login/{username}/{password}")
    public String login(@PathVariable("username") String username,
                        @PathVariable("password") String password) {

        boolean loginFlag = userService.login(username, password);

        if (loginFlag) {
            return "登陆成功";
        } else {
            return "用户名或密码错误";
        }

    }
}
