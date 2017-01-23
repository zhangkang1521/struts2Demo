package org.zk.struts2Demo.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangkang on 2017/1/22.
 */
public class AuthInterceptor implements Interceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthInterceptor.class);

    public String intercept(ActionInvocation invocation) throws Exception {
        LOGGER.debug("auth intercept");
        return invocation.invoke();
    }

    public void destroy() {
        LOGGER.debug("destroy");
    }

    public void init() {
        LOGGER.debug("init");
    }
}
