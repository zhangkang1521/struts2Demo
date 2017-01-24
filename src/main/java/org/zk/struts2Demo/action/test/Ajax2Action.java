package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.json.annotations.JSON;

/**
 * Created by zhangkang on 2017/1/24.
 */
public class Ajax2Action extends ActionSupport {

    private boolean success;

    private String msg;

    @Override
    public String execute() throws Exception {
        success = true;
        msg = "successful!";
        return SUCCESS;
    }

    @JSON(name = "message")
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
