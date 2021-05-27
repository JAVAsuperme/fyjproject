package com.fyj.demo.mapper;

import com.fyj.demo.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from User "
            + " where username = #{username} "
            + " and password = #{password}")
    User queryOne(@Param("username") String username, @Param("password") String password);
}
