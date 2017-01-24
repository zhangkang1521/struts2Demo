package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.ActionSupport;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by zhangkang on 2017/1/24.
 */
public class AjaxAction extends ActionSupport {

    private InputStream inputStream;

    public String test1() {
        String json = "{ \"success\": \"true\", \"msg\":\"it's ok!\"}";
        inputStream = new ByteArrayInputStream(json.getBytes());
        return SUCCESS;
    }

    public InputStream getResult() {
        return inputStream;
    }
}
