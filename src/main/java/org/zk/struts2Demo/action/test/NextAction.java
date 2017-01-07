package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

/**
 * Created by Administrator on 1/7/2017.
 */
public class NextAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
        String str = ServletActionContext.getRequest().getParameter("m");
        System.out.println("m:"+str);
        return SUCCESS;
    }
}
