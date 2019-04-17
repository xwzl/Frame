package com.frame.xwz.service;


import com.frame.xwz.model.User;

import java.util.List;

/**
 * @author xuweizhi
 * @date 2019/04/14 13:56
 */
public interface MyServices {

    User getUserById(Integer id);

    List<User> getUsers();

}
