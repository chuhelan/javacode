package com.chuhelan.controller;

import com.chuhelan.beans.User;
import com.chuhelan.dao.UserDao;
import com.chuhelan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/10/5 14:11
 */

@RestController
public class UserCtrl {

    @Autowired
    UserService service;

    @RequestMapping("/login")
    public String doLogin(User user) {

        user = service.login(user);

        return "用户登录: " + user;
    }

    @RequestMapping( "/register")
    public String doRegister(User user) {
        service.register(user);
        return "注册成功！" + user;
    }
}
