package org.zk.struts2Demo.action.login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.deploy.association.Action;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Administrator on 1/2/2017.
 */
public class LoginAction extends ActionSupport{
    private String username;
    private String password;

    private String tip;

    @Override
    public String execute() throws Exception {


        if("zk".equals(username) && "123456".equals(password)) {
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("username", username);
            return SUCCESS;
        }  else {
            tip = "用户名或密码错误";
            return ERROR;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
