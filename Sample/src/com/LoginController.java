package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginController extends HttpServlet {
    private String username="root";
    private String password = "root";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
        }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        System.out.println("Inside post method");
        String pwd = req.getParameter("password");
        if(username.equals( user) && password.equals(pwd)){
            System.out.println("Equal");
            HttpSession session = req.getSession();
        }
        else{
            resp.getWriter().write("Invalid Username or Password");
        }

    }
}

