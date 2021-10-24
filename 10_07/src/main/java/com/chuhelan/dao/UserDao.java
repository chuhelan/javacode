package com.chuhelan.dao;

import com.chuhelan.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/10/5 14:32
 */

@Mapper
@Repository
public interface UserDao {
    User selectUser(User u);
    int registerUser(User u);
}
