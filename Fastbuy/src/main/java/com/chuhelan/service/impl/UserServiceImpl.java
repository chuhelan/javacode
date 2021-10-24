package com.chuhelan.service.impl;

import com.chuhelan.beans.User;
import com.chuhelan.dao.UserDao;
import com.chuhelan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/10/21 14:35
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User login(User u) {
        return userDao.select_user_by_email_and_password(u);
    }

    @Override
    public int register(User u) {
        return userDao.register_user(u);
    }
}
