package com.frame.xwz.mapper;

import com.frame.xwz.auto.MyLocalMethod;
import com.frame.xwz.auto.MyLocalMethodReinforce;
import com.frame.xwz.auto.MyMapper;
import com.frame.xwz.auto.MySelect;
import com.frame.xwz.model.Blog;
import com.frame.xwz.model.User;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author xuweizhi
 * @date 2019/04/11 19:21
 */
@MyMapper
public interface Mapper {

    /**
     * 打印博客信息
     */
    @MyLocalMethod(value = "我们都是好孩子", className = "com.frame.xwz.model.Blog",
            methodName = "fineBlog", methodParamClass = {"java.lang.String", "java.lang.String"},
            methodParamValues = {"欢迎来到 Java 技术栈博客专栏", "评论数：1211"})
    void getBlog(Blog blog, String title, String records);

    @MyLocalMethodReinforce(className = "com.frame.xwz.model.Blog")
    void fineBlog(String title, String records);

    @MyLocalMethodReinforce(className = "com.frame.xwz.model.Blog")
    void badBlog(Date date);

    @MySelect(value = "select * from user where u_id = #{uId} and address = #{address}", nameSpace = "com.frame.xwz.model.User")
    User getUser(Map<String, Object> mapper);

    @MySelect(value = "select * from user where u_id = #{uId} and address = #{address}", nameSpace = "com.frame.xwz.model.User")
    User getUserA(User user);

    @MySelect(value = "select * from user where u_id = #{uId} and address = #{address}", nameSpace = "com.frame.xwz.model.User")
    User getUserB(Integer integer, String address);

    @MySelect(value = "select * from user", nameSpace = "com.frame.xwz.model.User")
    List<User> getUserC();
}
