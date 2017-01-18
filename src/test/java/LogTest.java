import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import sun.rmi.runtime.Log;

/**
 * Created by zhangkang on 2017/1/16.
 */
public class LogTest {

    static Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        // struts2 使用日志顺序
        // 1. commons-logging
        // 2. slf4j
        // 3. log4j
        // 4. jdk log
        logger.debug("xxx");
        logger.info("xxx");
    }
}
