package com;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by krishan on 6/28/2017.
 */
@WebServlet(name = "Login")
public class Login extends HttpServlet {
    private String username="root";
    private String password = "root";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
//        System.out.println("Inside post method");
        String pwd = request.getParameter("password");
//        if(username.equals(user) && password.equals(pwd)){
//            System.out.println("Equal");
//            HttpSession session = request.getSession();
//            session.setAttribute("user",user.toUpperCase());
            request.setAttribute("user",user.toLowerCase());

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/JdbcConnection");
            requestDispatcher.forward(request,response);

        }
        else{
            response.getWriter().write("Invalid Username or Password");
            System.out.println("invalid");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.html");
            requestDispatcher.forward(request,response);
        }

    }


}
