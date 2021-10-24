package com.chuhelan.dao;

import com.chuhelan.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/10/21 14:14
 */

@Mapper
@Repository
public interface UserDao {
    User select_user_by_email_and_password(User u);

    int register_user(User u);
}
