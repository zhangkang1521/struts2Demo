package org.zk.struts2Demo.action.perm;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * Created by Administrator on 1/7/2017.
 */
public class ResultTypeAction {

    @Action(value = "redirect", results = {
            @Result(type = "redirect", location = "/perm/role.action")
    })
    public String redirect() {
        return "success";
    }

    @Action(value = "chain", results = {
            @Result(type = "chain", params = {
                    "namespace", "/perm",
                    "actionName", "role"
            })
    })
    public String chain() {
        return "success";
    }
}
