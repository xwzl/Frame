package com.frame.xwz.service.impl;


import com.frame.xwz.mapper.Mapper;
import com.frame.xwz.model.User;
import com.frame.xwz.service.MyServices;
import com.frame.xwz.source.auto.MyAutowired;
import com.frame.xwz.source.auto.MyService;

/**
 * @author xuweizhi
 * @date 2019/04/14 18:58
 */
@MyService(alias = "myServiceImpl2")
public class MyServiceImpl2 implements MyServices {

    @MyAutowired
    public Mapper mapper;

    @Override
    public User getUserById(Integer id) {
        return mapper.getUserById(id);
    }

}
