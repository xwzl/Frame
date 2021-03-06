package com.frame.xwz.model;


import com.frame.xwz.source.auto.MyAutowired;
import com.frame.xwz.source.auto.MyService;
import com.frame.xwz.source.auto.MyValue;

import java.util.Date;

/**
 * 测试 Value 注解
 *
 * @author xuweizhi
 * @date 2019/04/11 23:01
 */
@MyService(alias = "dogli")
public class Dog {

    @MyValue("${username}")
    private String username;

    @MyValue("${creatTime}")
    private Date createDate;

    @MyValue("${age}")
    private Integer age;

    @MyAutowired
    private Blog blog;

    public Dog() {
    }

    public Dog(String username, Date createDate, Integer age) {
        this.username = username;
        this.createDate = createDate;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "username='" + username + '\'' +
                ", createDate=" + createDate +
                ", age=" + age +
                '}';
    }
}
