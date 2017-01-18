package org.zk.struts2Demo.action;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zhangkang on 2017/1/18.
 */
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/view/user/userList.jsp");

        //dispatcher.forward(req, resp);
        PrintWriter pw = resp.getWriter();
        pw.append("hello");
        pw.close();
//        resp.setContentType("text/html");
        System.out.println(resp.isCommitted());
//        dispatcher.include(req, resp);
//        RequestDispatcher dispatcher2 = req.getRequestDispatcher("/view/user/userForm.jsp");
//        dispatcher2.include(req, resp);
    }
}
