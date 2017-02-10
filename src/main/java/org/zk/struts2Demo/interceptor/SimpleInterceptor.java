package org.zk.struts2Demo.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangkang on 2017/2/10.
 */
public class SimpleInterceptor extends AbstractInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleInterceptor.class);

    public String intercept(ActionInvocation invocation) throws Exception {
        LOGGER.info("--------simpleInterceptor begin-----------------");
        long start = System.currentTimeMillis();
        String result = invocation.invoke();
        long end =  System.currentTimeMillis();
        LOGGER.info("{}：执行时间{}", invocation.getAction().toString(), (end - start)+"");
        LOGGER.info("--------simpleInterceptor end-----------------");
        return result;
    }
}
