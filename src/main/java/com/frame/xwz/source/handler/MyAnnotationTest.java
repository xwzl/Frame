package com.frame.xwz.source.handler;


import com.frame.xwz.model.Blog;
import com.frame.xwz.source.auto.MyAutowired;
import com.frame.xwz.source.auto.MyComponent;

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
