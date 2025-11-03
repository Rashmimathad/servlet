package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/therapySession",loadOnStartup = 65)
public class TherapySessionServlet extends GenericServlet {

    public TherapySessionServlet(){
        System.out.println("Created TherapySession servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from TherapySession servlet");
    }
}
