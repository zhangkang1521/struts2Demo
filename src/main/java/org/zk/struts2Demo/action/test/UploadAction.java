package org.zk.struts2Demo.action.test;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;

/**
 * Created by zhangkang on 2017/2/6.
 */
public class UploadAction extends ActionSupport{
    private String title;
    private File file1;
    private String file1FileName;
    private String file1ContentType;

    @Override
    public String execute() throws Exception {
        System.out.println(file1.getName());
        String str = FileUtils.readFileToString(file1);
        String path = ServletActionContext.getRequest().getServletContext().getRealPath("/upload");
        FileUtils.copyFile(file1, new File(path+"/"+file1FileName));
        return SUCCESS;
    }

    public File getFile1() {
        return file1;
    }

    public void setFile1(File file1) {
        this.file1 = file1;
    }

    public String getFile1FileName() {
        return file1FileName;
    }

    public void setFile1FileName(String file1FileName) {
        this.file1FileName = file1FileName;
    }

    public String getFile1ContentType() {
        return file1ContentType;
    }

    public void setFile1ContentType(String file1ContentType) {
        this.file1ContentType = file1ContentType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
