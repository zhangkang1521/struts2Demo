package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.ActionSupport;
import org.zk.struts2Demo.entity.User;

import java.util.Date;

/**
 * 类型转换测试
 * Created by zhangkang on 2017/1/22.
 */
public class ConvertAction extends ActionSupport{
    private Integer age;
    private Date birthday;

    private User user;

    public String input() {
        return INPUT;
    }

    public String test1() throws Exception {
        System.out.println(age);
        return SUCCESS;
    }

    public Integer getAge() {
        return age;
    }

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
}
