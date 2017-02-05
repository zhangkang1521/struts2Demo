package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zhangkang on 2017/2/5.
 */
public class AjaxTokenAction extends ActionSupport {

    private String username;

    public String input() {
        return INPUT;
    }

    public String submit() {
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
