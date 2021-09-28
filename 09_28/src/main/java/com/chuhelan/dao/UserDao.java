package com.chuhelan.dao;

import com.chuhelan.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/9/28 21:46
 */

@Mapper
@Repository
public interface UserDao {
    User selectUserByUserNameAndPass(User user);
}
