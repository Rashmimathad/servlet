package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/yogaSession",loadOnStartup = 69)
public class YogaSessionServlet extends GenericServlet {

    public YogaSessionServlet(){
        System.out.println("Created YogaSession servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from YogaSession servlet");
    }
}
