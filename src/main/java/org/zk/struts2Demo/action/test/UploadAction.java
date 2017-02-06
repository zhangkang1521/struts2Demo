package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.deploy.util.StringUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * Created by zhangkang on 2017/2/6.
 */
public class UploadAction extends ActionSupport{
    private File file1;

    @Override
    public String execute() throws Exception {
        System.out.println(file1.getName());
        String str = FileUtils.readFileToString(file1);
        return SUCCESS;
    }

    public File getFile1() {
        return file1;
    }

    public void setFile1(File file1) {
        this.file1 = file1;
    }
}
