package com.ttn.bootcamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by neetesh on 27/6/17.
 */
public class LoginServlet extends HttpServlet {

    private String adminUsername;
    private String adminPassword;

    @Override
    public void init() throws ServletException {
        ServletContext context = getServletContext();
        adminUsername = context.getInitParameter("adminUsername");
        adminPassword = context.getInitParameter("adminPassword");

        String databaseDriverClass = context.getInitParameter("databaseDriverClass");
        String databaseUser = context.getInitParameter("databaseUser");
        String databasePassword = context.getInitParameter("databasePassword");
        String databaseConnectionString = context.getInitParameter("databaseConnectionString");
        try {
            Class.forName(databaseDriverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection(databaseConnectionString, databaseUser, databasePassword);
            context.setAttribute("dbConnection", connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        if (user.equals(adminUsername) && pass.equals(adminPassword)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", "Neetesh Bhardwaj");
            RequestDispatcher dispatcher = req.getRequestDispatcher("/dashboard");
            dispatcher.forward(req, resp);
        } else {
            resp.sendRedirect("/");
        }
    }
}
