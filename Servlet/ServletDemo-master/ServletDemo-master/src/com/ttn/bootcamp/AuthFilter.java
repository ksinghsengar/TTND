package com.ttn.bootcamp;

import javax.servlet.*;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by neetesh on 27/6/17.
 */
public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       /* ServletContext context = servletRequest.getServletContext();
        String adminUsername = context.getInitParameter("adminUsername");
        String adminPassword = context.getInitParameter("adminPassword");
        String user = servletRequest.getParameter("user");
        String pass = servletRequest.getParameter("pass");
        if (user.equals(adminUsername) && pass.equals(adminPassword)) {
            RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("/dashboard");
            dispatcher.forward(servletRequest, servletResponse);
        }*/

        System.out.println("Filter called");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
