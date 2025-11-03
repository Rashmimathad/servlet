package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/vitalSigns",loadOnStartup = 73)
public class VitalSignsServlet extends GenericServlet {

    public VitalSignsServlet(){
        System.out.println("Created VitalSigns servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from VitalSigns servlet");
    }
}
