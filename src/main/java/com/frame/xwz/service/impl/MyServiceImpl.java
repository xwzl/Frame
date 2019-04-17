package com.frame.xwz.service.impl;


import com.frame.xwz.mapper.Mapper;
import com.frame.xwz.model.User;
import com.frame.xwz.service.MyServices;
import com.frame.xwz.source.auto.MyAutowired;
import com.frame.xwz.source.auto.MyService;

import java.util.List;

/**
 * @author xuweizhi
 * @date 2019/04/14 18:58
 */
@MyService(alias = "myServiceImpl1")
public class MyServiceImpl implements MyServices {

    @MyAutowired
    public Mapper mapper;


    @Override
    public User getUserById(Integer id) {
        return mapper.getUserById(id);
    }

    @Override
    public List<User> getUsers() {
        return mapper.getUserC();
    }
}
