package org.zk.struts2Demo.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

/**
 * http://raising.iteye.com/blog/2174372
 * Created by zhangkang on 2017/1/20.
 */
public class TestBodyTag extends BodyTagSupport {

    private String type;
    int count = 2;

    @Override
    public int doAfterBody() throws JspException {
        System.out.println("=========doAfterBody=========");
        return SKIP_BODY;
        //EVAL_BODY_AGAIN; 再次包含标签体内容
    }

    @Override
    public int doEndTag() throws JspException {
        System.out.println("========doEndTag=========");
        JspWriter out = this.pageContext.getOut();
        try {
            out.println("doEngTag"); // 输出到页面的内容
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EVAL_PAGE;
//        return SKIP_PAGE; //不再解析以后的内容
    }

    @Override
    public int doStartTag() throws JspException {
        System.out.println("======doStartTag========");
        System.out.println("then you must call " + type.toUpperCase() + " first");
        //return SKIP_BODY; // 输出不包含标签体内容，不调用doAfterBody
        return EVAL_BODY_INCLUDE; // 输出包含标签体内容
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
