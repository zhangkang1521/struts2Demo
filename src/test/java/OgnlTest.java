import com.opensymphony.xwork2.ognl.OgnlUtil;
import ognl.Ognl;
import ognl.OgnlContext;
import org.junit.Test;

/**
 * Created by zhangkang on 2017/1/22.
 */
public class OgnlTest {

    @Test
    public void test1() throws Exception{
        OgnlContext context = new OgnlContext();
        //Ognl.getValue("@java.lang.Runtime@getRuntime().exec('calc')",context,context.getRoot());
        //Runtime.getRuntime().exec("calc");
    }

    @Test
    public void test2() throws Exception{
        //ognlUtil.setValue(expr, context, root, value);
    }


}
