package com.fyj.demo.controller;

import com.fyj.demo.dto.User;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/choose")
    public String getUser(@RequestParam("choose") int choose) {
        StringBuilder stringBuilder = new StringBuilder();
        switch (choose){
            case 1 :
                User user = new User();
                user.setUserID(1);
                user.setUsername("zhangsan");
                user.setPassword("123456");
                stringBuilder.append(new Gson().toJson(user));
                break;
            case 2 :
                User user2 = new User();
                user2.setUserID(2);
                user2.setUsername("lisi");
                user2.setPassword("346544");
                stringBuilder.append(new Gson().toJson(user2));
                break;
            case 3 :
                User user3 = new User();
                user3.setUserID(3);
                user3.setUsername("wangwu");
                user3.setPassword("7974164");
                stringBuilder.append(new Gson().toJson(user3));
                break;
            default:
                stringBuilder.append("NO_SUCH_PERSON");
        }
        return stringBuilder.toString();
    }
}
