package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

/**
 * Created by zhangkang on 2017/2/9.
 */
public class DownloadAction extends ActionSupport {

    public InputStream getTargetFile() {
        return ServletActionContext.getServletContext().getResourceAsStream("/img/struts2-core.png");
    }

    @Override
    public String execute() throws Exception {
        if(hasPermission()) {
            return SUCCESS;
        }else {
            // 权限控制，不允许下载，拦截到登录界面
            return INPUT;
        }
    }

    private boolean hasPermission() {
        return false;
    }
}
