package com.frame.xwz.mapper;


import com.frame.xwz.model.Blog;
import com.frame.xwz.model.User;
import com.frame.xwz.source.auto.*;

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

    @MyLocalMethodReinforce(className = "com.frame.xwz.Blog")
    void fineBlog(String title, String records);

    @MyLocalMethodReinforce(className = "com.frame.xwz.Blog")
    void badBlog(Date date);

    @MySelect(value = "select * from user where u_id = #{uId} and address = #{address}", nameSpace = "com.frame.xwz.model.User")
    User getUser(Map<String, Object> mapper);

    @MySelect(value = "select * from user where u_id = #{uId}", nameSpace = "com.frame.xwz.model.User")
    User getUserById(Integer id);

    @MySelect(value = "select * from user where u_id = #{uId} and address = #{address}", nameSpace = "com.frame.xwz.model.User")
    User getUserB(Integer integer, String address);

    @MySelect(value = "select * from user", nameSpace = "com.frame.xwz.model.User")
    List<User> getUserC();

    @MyInsert(value = " insert into user (u_id,address,role) values (null,#{address},#{role})",
            nameSpace = "com.frame.xwz.model.User")
    boolean addUser(User uer);


    @MyUpdate(value = " update user set address =#{address},apartment=#{apartment},create_time=#{createTime}" +
            ",password=#{password},phone_number=#{phoneNumber},username=#{username},role=#{role} where u_id = #{uId}",
            nameSpace = "com.frame.xwz.User")
    void updateUser(User user);

    @MyDelete(value = "delete from user where u_id = #{uId} and role = #{role}", nameSpace = "com.frame.xwz.model.User")
    void delectUser(User user);

    @MyDelete(value = "delete from user where u_id = #{uId}", nameSpace = "com.frame.xwz.model.User")
    void delectUser(Integer id);
}
