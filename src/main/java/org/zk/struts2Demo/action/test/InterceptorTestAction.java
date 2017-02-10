package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zhangkang on 2017/2/10.
 */
public class InterceptorTestAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        System.out.println("interceptor test");
        return SUCCESS;
    }
}
