package org.zk.struts2Demo.action;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by Administrator on 2016/4/3.
 */
//@Namespace("/user")
public class UserAction {


//    @Action(
//            value = "list",
//            results = {
//                    @Result(name = "success", location = "/view/user/userList.jsp"),
//                    @Result(name = "success2", location = "/view/user/userList2.jsp")
//            }
//
//    )
    public String list(){
        return "success2";
    }

    public String add(){
        return "success";
    }

//    public String execute(){
//        return "success";
//    }

}
