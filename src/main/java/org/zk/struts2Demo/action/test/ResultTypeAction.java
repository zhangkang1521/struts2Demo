package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 1/7/2017.
 */
public class ResultTypeAction extends ActionSupport{

    public String execute() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("zk");
        nameList.add("zy");
        nameList.add("zq");
        ServletActionContext.getRequest().setAttribute("nameList", nameList);
        String m = ServletActionContext.getRequest().getParameter("m");
        return m;
    }
}
