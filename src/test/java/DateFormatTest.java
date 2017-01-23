import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by zhangkang on 2017/1/23.
 */
public class DateFormatTest {
    @Test
    public void test1() throws Exception{
        Locale locale = Locale.CHINA;
        DateFormat dt1 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, locale);
        DateFormat dt2 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, locale);
        DateFormat dt3 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, locale);

        DateFormat d1 = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        DateFormat d2 = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        DateFormat d3 = DateFormat.getDateInstance(DateFormat.LONG, locale);

        DateFormat rfc3339         = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        DateFormat rfc3339dateOnly = new SimpleDateFormat("yyyy-MM-dd");

//        System.out.println(dt1.parse("17-1-1 2时10分20秒"));
//        System.out.println(dt2.parse("17-1-1 23:10:20"));
//
//        System.out.println(d1.parse("17-1-1"));
//        System.out.println(d2.parse("2017-1-2"));
//        System.out.println(d3.parse("2017年1月3日"));

        System.out.println(rfc3339.parse("17-1-1T23:10:20"));

    }
}
