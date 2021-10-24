package com.chuhelan.service.impl;

import com.chuhelan.beans.User;
import com.chuhelan.dao.UserDao;
import com.chuhelan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/10/5 14:32
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;

    @Override
    public User login(User u) {
        return dao.selectUser(u);
    }

    @Override
    public int register(User u) {
        return dao.registerUser(u);
    }


}
