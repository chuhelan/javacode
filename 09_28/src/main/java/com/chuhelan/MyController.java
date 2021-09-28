package com.chuhelan;

import com.chuhelan.beans.User;
import com.chuhelan.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

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
    public String login(User user, HttpServletRequest request) {
        System.out.println("-----------输出用户信息-----------");
        System.out.println(user);
        System.out.println("--------------------------------");

        User u;
        u = userDao.selectUserByUserNameAndPass(user);

        return "姓名："+u.getUser_name()+"\n"+
                "性别："+u.getUser_gender()+"\n"+
                "手机号："+u.getUser_phone()+"\n"+
                "电子邮件："+user.getUseremail();
    }
}
