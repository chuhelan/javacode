package com.chuhelan;

import com.chuhelan.beans.User;
import com.chuhelan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/9/28 21:15
 */

@RestController
public class MyController {

    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("-----------输出用户信息-----------");
        System.out.println(user);
        System.out.println("--------------------------------");

        User u;
        u = userDao.selectUserByUserNameAndPass(user);

        return "姓名：" + u.getUser_name() + "\n" +
                "性别：" + u.getUser_gender() + "\n" +
                "手机号：" + u.getUser_phone() + "\n" +
                "电子邮件：" + user.getUseremail();
    }

    @RequestMapping("/login2")
    public ModelAndView index2(ModelAndView modelAndView, User user) {

        modelAndView.setViewName("result");
        User u;
        u = userDao.selectUserByUserNameAndPass(user);

        modelAndView.addObject("name", u.getUser_name());
        modelAndView.addObject("gender", u.getUser_gender());
        modelAndView.addObject("profile", u.getUser_profile());
        modelAndView.addObject("email", user.getUseremail());
        modelAndView.addObject("phone", u.getUser_phone());
        return modelAndView;
    }

}
