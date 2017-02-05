package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zhangkang on 2017/2/5.
 */
public class ErrorAction extends ActionSupport {

    public String test1() {
        addActionError("fuck");
        addActionError("fuck2");
        addActionMessage("msg1");
        addActionMessage("msg2");
        return SUCCESS;
    }
}
