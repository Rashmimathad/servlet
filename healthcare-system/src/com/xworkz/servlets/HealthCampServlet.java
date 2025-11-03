package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/healthCamp",loadOnStartup = 66)
public class HealthCampServlet extends GenericServlet {

    public HealthCampServlet(){
        System.out.println("Created HealthCamp servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from HealthCamp servlet");
    }
}
