package org.zk.struts2Demo.action;


import org.zk.struts2Demo.service.UserService;

/**
 * Created by Administrator on 2016/4/3.
 */
public class UserAction {

    private UserService userService;

    public UserAction(){
        System.out.println("new UserAction()");
    }

    public String list(){
        return "success";
    }

    public String add(){
        return "success";
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
