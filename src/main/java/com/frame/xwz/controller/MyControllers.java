package com.frame.xwz.controller;


import com.frame.xwz.auto.*;
import com.frame.xwz.service.MyServices;

/**
 * @author xuweizhi
 * @date 2019/04/14 16:01
 */
@MyController
@MyRequestMapping("we")
public class MyControllers {

    @MyResource("com.frame.xwz.service.impl.MyServiceImpl")
    public MyServices myServices;

    @MyAutowired
    @MyQualifier("myServiceImpl2")
    public MyServices getMyServices;

    @MyRequestMapping("we/we")
    public void say() {
        System.out.println(myServices.getClass());
        System.out.println(getMyServices.getClass());
    }

}
