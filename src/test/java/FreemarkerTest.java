import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangkang on 2017/1/18.
 */
public class FreemarkerTest {

    @Test
    public void test1() throws Exception{
        //创建一个合适的Configration对象
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_0);
        configuration.setLocalizedLookup(false);
        configuration.setDirectoryForTemplateLoading(new File("G:/"));
        configuration.setObjectWrapper(new DefaultObjectWrapper(Configuration.VERSION_2_3_0));
        //获取或创建一个模版。
        Template template = configuration.getTemplate("static.html");
        // model
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("description", "hello,world!");
        //
        template.process(model, new FileWriter("G:/success.html"));

    }
}
