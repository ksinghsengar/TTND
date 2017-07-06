package com.ttn.bootcamp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;

/**
 * Created by neetesh on 27/6/17.
 */
public class DashboardServlet extends HttpServlet {

    private static String COUNTER = "counter";

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        String counter = config.getInitParameter(COUNTER);
        Integer integer = Integer.valueOf(counter);
        getServletContext().setAttribute(COUNTER, integer);
    }

   /* @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        Connection connection = (Connection) context.getAttribute("dbConnection");
        Integer counter = (Integer) context.getAttribute(COUNTER);
        if (null == req.getSession(true)) {
            context.setAttribute(COUNTER, ++counter);
        }
        resp.getWriter().write("Having connection : " + (connection != null) + " hits : " + counter);
    }*/

    /*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File file = new File("/home/neetesh/BOOTCAMP/sample.pdf");
        FileInputStream stream = new FileInputStream(file);

        OutputStream outputStream = resp.getOutputStream();
        int i = -1;

        while ((i = stream.read()) != -1) {
            outputStream.write(i);
        }

        resp.setContentType("application/force-download");
        resp.setContentLength((int) file.length());
        resp.setHeader("Content-Disposition", "attachment; filename=\"samplefile.txt\"");
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (null != session) {
            resp.getWriter().write("Hello " + session.getAttribute("user") + " from dashboard");
        } else {
            resp.getWriter().write("No session");
        }
    }
}
