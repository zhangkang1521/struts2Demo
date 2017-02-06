package org.zk.struts2Demo.action;

import freemarker.cache.WebappTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangkang on 2017/1/18.
 */
public class TestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if ("freemarker".equals(action)) {
            testFreemarker(req, resp);
        } else if ("tag".equals(action)) {
            testTag(req, resp);
        } else if ("upload".equals(action)) {
            testUpload(req, resp);
        }
    }

    /**
     * commons-fileupload文件上传
     * http://localhost:8080/view/test/uploadForm.jsp
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void testUpload(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
            ServletFileUpload fileUpload = new ServletFileUpload(diskFileItemFactory);
            List<FileItem> list = fileUpload.parseRequest(req);
            for (FileItem item : list) {
                if(item.isFormField()){

                } else {
                    InputStream is = item.getInputStream();
                    String str = Streams.asString(is);
                    System.out.println(str);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 自定义标签
     * http://localhost:8080/test.s?action=tag
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void testTag(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/view/test/tag.jsp").forward(req, resp);
    }

    /**
     * 集成freemarker
     * http://localhost:8080/test.s?action=freemarker
     *
     * @param req
     * @param resp
     */
    public void testFreemarker(HttpServletRequest req, HttpServletResponse resp) {
        try {
            //创建一个合适的Configration对象
            Configuration configuration = new Configuration(Configuration.VERSION_2_3_0);
            configuration.setLocalizedLookup(false);
            configuration.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
//            String ctxPath = req.getServletContext().getRealPath("/");
//            configuration.setDirectoryForTemplateLoading(new File(ctxPath));
            configuration.setTemplateLoader(new WebappTemplateLoader(req.getServletContext()));
            configuration.setObjectWrapper(new DefaultObjectWrapper(Configuration.VERSION_2_3_0));
            //获取或创建一个模版。
            Template template = configuration.getTemplate("/view/test/servletFreemarker.tpl");
            // model
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("key", "freemarker!");
            List<String> list = new ArrayList<String>();
            list.add("zk");
            list.add("zy");
            list.add("zq");
            model.put("nameList", list);
            // 将生成的html输出到response
            template.process(model, resp.getWriter());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
