import freemarker.core.TemplateElement;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import org.junit.Before;
import org.junit.Test;
import org.zk.struts2Demo.entity.User;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://my.oschina.net/flashsword/blog/160747
 */
public class FreemarkerTest {

    Configuration config;

    Writer writer;

    @Before
    public void beforeTest() throws Exception{
        config = new Configuration(Configuration.VERSION_2_3_0);
        config.setLocalizedLookup(false); // 不用国际化查找
        URL url = getClass().getClassLoader().getResource("freemarker");
        config.setDirectoryForTemplateLoading(new File(url.getFile())); // 模板路径
        // 不用设置wrapper，默认提供DefaultObjectWrapper
        //config.setObjectWrapper(new DefaultObjectWrapper(Configuration.VERSION_2_3_0));
        writer  = new PrintWriter(System.out);
    }



    @Test
    public void test1() throws Exception{
        // ftl: freemarker template language
        Template template = config.getTemplate("first.ftl");
//        Map<String, Object> model = new HashMap<String, Object>();
//        model.put("description", "hello,world!");
        User user = new User();
        user.setUserName("zk");
        template.process(user, writer);
    }

    @Test
    public void testMacro() throws Exception{
        Template template = config.getTemplate("testMacro.ftl");
        template.process(null, writer);
    }

    @Test
    public void testUpper() throws Exception {
        config.setSharedVariable("upper", new UpperDirective());
        Template template = config.getTemplate("upper.ftl");
        template.process(null, writer);
    }

    @Test
    public void testFunction() throws Exception {
        Template template = config.getTemplate("function.ftl");
        template.process(null, writer);
    }

    @Test
    public void testFunction2() throws Exception {
        config.setSharedVariable("rand", new RandomFunction());
        Template template = config.getTemplate("function2.ftl");
        template.process(null, writer);
    }




}
