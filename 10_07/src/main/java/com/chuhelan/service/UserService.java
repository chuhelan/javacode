package com.chuhelan.service;

import com.chuhelan.beans.User;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/10/5 14:30
 */
public interface UserService {
    User login(User u);

    int register(User u);
}
