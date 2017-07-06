package com;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

import static java.lang.System.out;

@WebServlet(name = "JdbcConnection")
public class JdbcConnection extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         Connection connection;
//         PreparedStatement statement;
        Statement statement;
        PreparedStatement preparedStatement;
         String query;
         String username = null;
         String email = null;
         String pwd = null;
         ServletContext servletContext = request.getServletContext();
         String user =   servletContext.getInitParameter("databaseUser");
         String password = servletContext.getInitParameter("databasePassword");
         String driver_class = servletContext.getInitParameter("databaseDriverClass");
         String url = servletContext.getInitParameter("databaseConnectionString");

         String page = (String) request.getAttribute("previous_page");

        System.out.println("Page: "+page);
//      System.out.println("User: "+user +"\nPassword: "+password+"\nDriver_class: "+driver_class+"\nUrl: "+url+"\nPrevious Page: "+page);
//        System.out.println("Username: "+username+ "\nEmail: "+email+"\nPassword: "+pwd);
        try {
            Class.forName(driver_class);
            connection = DriverManager.getConnection(url,user,password);
            if(page.equals("Register")){
                query = "insert into register(user,email,password) values(?,?,?)";
                username = request.getParameter("user");
                email =  request.getParameter("email");
                pwd = request.getParameter("regPassword");
                preparedStatement  = connection.prepareCall(query);
                preparedStatement.setString(1,username);
                preparedStatement.setString(2,email);
                preparedStatement.setString(3,pwd);

                if(preparedStatement.executeUpdate()>0) {
                    request.setAttribute("message", "Registered Successfully");
                    out.println("Successful");
                }
                else {
                    request.setAttribute("message", "Registration Unsuccessful");
                    out.println("UnSuccessful");
                }
                connection.close();
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
                    requestDispatcher.forward(request,response);

                }

           /* statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from blog");
            while(resultSet.next()) {
                System.out.println(resultSet.getString("user"));
                System.out.println(resultSet.getString("content"));
            }
*/
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
