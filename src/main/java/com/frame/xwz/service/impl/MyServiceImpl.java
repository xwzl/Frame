package com.frame.xwz.service.impl;


import com.frame.xwz.auto.MyAutowired;
import com.frame.xwz.auto.MyService;
import com.frame.xwz.mapper.Mapper;
import com.frame.xwz.service.MyServices;

/**
 * @author xuweizhi
 * @date 2019/04/14 18:58
 */
@MyService(alias = "myServiceImpl1")
public class MyServiceImpl implements MyServices {

    @MyAutowired
    public Mapper mapper;

    @Override
    public void run() {
        mapper.fineBlog("111", "2222");
    }
}
