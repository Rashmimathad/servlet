package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/clinicalData",loadOnStartup = 100)
public class ClinicalDataServlet extends GenericServlet {

    public ClinicalDataServlet(){
        System.out.println("Created ClinicalData servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from ClinicalData servlet");
    }
}
