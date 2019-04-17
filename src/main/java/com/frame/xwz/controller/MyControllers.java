package com.frame.xwz.controller;


import com.frame.xwz.model.User;
import com.frame.xwz.service.MyServices;
import com.frame.xwz.source.auto.*;

import java.util.List;

/**
 * @author xuweizhi
 * @date 2019/04/14 16:01
 */
@MyController
@MyRequestMapping("user")
public class MyControllers {

    @MyResource("com.frame.xwz.service.impl.MyServiceImpl")
    public MyServices myServices;

    @MyAutowired
    @MyQualifier("myServiceImpl2")
    public MyServices getMyServices;

    @MyRequestMapping("getUser")
    public User getUserById(Integer id, String name, Long age, User user, List<User> lists) {
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
        return myServices.getUserById(id);
    }

}
