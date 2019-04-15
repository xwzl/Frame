package com.frame.xwz.handler;


import com.frame.xwz.auto.MyAutowired;
import com.frame.xwz.auto.MyComponent;
import com.frame.xwz.model.Blog;

/**
 * @author xuweizhi
 * @date 2019/04/11 19:20
 */
@MyComponent
public class MyAnnotationTest {

    @MyAutowired
    Blog blog;

    public static void main(String[] args) {
    }


}
