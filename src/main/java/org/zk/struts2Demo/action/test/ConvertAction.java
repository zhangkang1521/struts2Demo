package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import org.zk.struts2Demo.entity.User;

import java.util.Date;

/**
 * 类型转换测试
 * Created by zhangkang on 2017/1/22.
 */
public class ConvertAction extends ActionSupport{
    private String username;
    private Integer age;
    private Date birthday;

    private User user;

    public String input() {
        return INPUT;
    }

    public String test1() throws Exception {
        System.out.println(user);
        return SUCCESS;
    }

    public Integer getAge() {
        return age;
    }

    @RequiredStringValidator(message = "必须输入年龄")
    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
