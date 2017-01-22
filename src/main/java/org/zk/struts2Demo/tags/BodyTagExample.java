package org.zk.struts2Demo.tags;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.StringWriter;

/**
 * Created by zhangkang on 2017/1/20.
 */
public class BodyTagExample extends BodyTagSupport {

    private int counts;

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public int doStartTag() throws JspTagException {
        if (counts > 0) {
            return EVAL_BODY_BUFFERED;
        } else {
            return SKIP_BODY;
        }
    }


    public int doAfterBody() throws JspTagException {
        if (counts > 1) {
            counts--;
            return EVAL_BODY_BUFFERED;
        } else {
            return SKIP_BODY;
        }
    }

    public int doEndTag() throws JspTagException {
        try {
            if (bodyContent != null) {
                bodyContent.writeOut(bodyContent.getEnclosingWriter());
            }
        } catch (java.io.IOException e) {
            throw new JspTagException("IO Error: " + e.getMessage());
        }
        return EVAL_PAGE;
    }
}
