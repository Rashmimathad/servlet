package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/adminDashboard",loadOnStartup = 45)
public class AdminDashboardServlet extends GenericServlet {

    public AdminDashboardServlet(){
        System.out.println("Created AdminDashboard servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from AdminDashboard servlet");
    }
}
