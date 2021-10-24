package com.chuhelan.beans;

import lombok.Data;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/10/21 14:11
 */

@Data
public class User {
    String user_email;
    String user_password;
    String user_name;
    String user_gender;
    String user_phone;
    String user_profile;
}
