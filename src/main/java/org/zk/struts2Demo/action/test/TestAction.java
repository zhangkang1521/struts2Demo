package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.PreResultListener;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 1/2/2017.
 */
public class TestAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private String username;

    public String servletActionContext(){
        ServletActionContext.getRequest();
        return Action.SUCCESS;
    }

    public String actionContext() {
        // actionContext是与当前线程绑定的对象
        ActionContext actionContext = ActionContext.getContext();
//        actionContext.put("aa", "xx");
        String str = (String)actionContext.get("aa");
        Map app = actionContext.getApplication(); // 应用信息
        Map param = actionContext.getParameters(); // 请求参数
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("a", "A");
        actionContext.setSession(map);
        Map session = actionContext.getSession();
        return Action.SUCCESS;
    }

    public String actionContext2() {
        // actionContext是与当前线程绑定的对象
        ActionContext actionContext = ActionContext.getContext();
        //Map map = actionContext.getApplication();
        Map map = actionContext.getSession();
        Integer counter = (Integer)map.get("counter");
        if(counter != null) {
            map.put("counter", ++counter);
        } else {
            map.put("counter", 0);
        }
        return Action.SUCCESS;
    }

    public String req() {
        String str = request.getParameter("str");
        return Action.SUCCESS;
    }

    public String resp() {
        Cookie cookie = new Cookie("user", "zk");
        response.addCookie(cookie);
        System.out.println(cookie);
        return Action.SUCCESS;
    }

    public String preResult() {
        ActionInvocation invocation = ActionContext.getContext().getActionInvocation();
        invocation.addPreResultListener(new PreResultListener() {
            public void beforeResult(ActionInvocation invocation, String resultCode) {
                System.out.println("resultCode: " + resultCode);
                invocation.getInvocationContext().put("a", "AA");
            }
        });
        addActionMessage("hello");
        return Action.SUCCESS;
    }

    public String exception() throws Exception{
        String e = request.getParameter("e");
        if ("sql".equals(e)) {
            throw new SQLException();
        } else if("exception".equals(e)){
            throw new IllegalArgumentException("xx");
        } else {
            return SUCCESS;
        }
    }

    public String ognl() throws Exception {
        username = "zk";
        request.setAttribute("username", "zk@request");
        return SUCCESS;
    }

    public String theme() {
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }
}
