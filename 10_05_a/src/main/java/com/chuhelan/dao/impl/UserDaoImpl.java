package com.chuhelan.dao.impl;

import com.chuhelan.beans.User;
import com.chuhelan.dao.UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/10/5 14:34
 */

/**
 * JDBC
 * Class.forName("com.mysql.Driver")
 * Connection con = DriverManager.getConnection(url,root,123);
 * Statement st = con.createStatement();
 * ResultSet rs = st.executeQuery(sql)
 * while(rs.next()){
 * <p>
 * }
 * rs.close();
 * st.close();
 * con.close();
 */

public class UserDaoImpl implements UserDao {

    @Override
    public User selectUser(User u) {

        return null;
    }

    @Override
    public int registerUser(User u) {
        return 0;
    }
}
