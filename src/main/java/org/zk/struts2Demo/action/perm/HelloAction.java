package org.zk.struts2Demo.action.perm;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

/**
 * Created by Administrator on 1/1/2017.
 */
// 全局Results,针对本类
@Results({
        @Result(name="failure", location="/view/commons/error.jsp")
})
@Namespace("/hello") // 覆盖/perm命名空间???
public class HelloAction {

    @Actions({
            @Action("m1"), // 不要写成这样@Action("/m1")，否则@Namespace不起作用
            @Action("method1")
    })
    public String method1() {
        return "failure";
    }

    // 局部Result
    @Action(value = "m2", results = {
            @Result(name="failure", location="/view/commons/error2.jsp")
    })
    public String method2() {
        return "failure";
    }
}
