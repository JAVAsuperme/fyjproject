package com.fyj.demo.service;

import com.fyj.demo.dto.User;
import com.fyj.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户模块 Service
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public boolean login(String username, String password) {
        User user = userMapper.queryOne(username, password);
        if (user == null) {
            return false;
        } else {
            return true;
        }
    }

}
