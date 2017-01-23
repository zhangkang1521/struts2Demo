package org.zk.struts2Demo.converter;

import org.apache.struts2.util.StrutsTypeConverter;
import org.zk.struts2Demo.entity.User;

import java.util.Map;

/**
 * Created by zhangkang on 2017/1/22.
 */
public class UserConvert extends StrutsTypeConverter {

    public Object convertFromString(Map context, String[] values, Class toClass) {
        User user = new User();
        user.setUserName(values[0]);
        user.setPassword(values[0]);
        return user;
    }

    public String convertToString(Map context, Object o) {
        return null;
    }
}
