package com.chuhelan.controller;

import com.chuhelan.beans.User;
import com.chuhelan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/10/21 14:13
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public Object login_by_useremail_and_userpassword(ModelAndView modelAndView, User user) {
        modelAndView.setViewName("product");
        System.out.println("------查找数据库------");
        user = userService.login(user);
        System.out.println("------查找完毕------");
        System.out.println("---------user：" + user + "------------");
        modelAndView.addObject("profile", user.getUser_profile());
        modelAndView.addObject("name", user.getUser_name());
        if (user != null) {
            return modelAndView;
        } else {
            return "账号或密码错误！";
        }
    }

    @RequestMapping("/register")
    public String register_by_userprofile(User user) {
        userService.register(user);
        return "注册成功！";
    }


}
