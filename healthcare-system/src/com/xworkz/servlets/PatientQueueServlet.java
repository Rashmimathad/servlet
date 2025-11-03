package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/patientQueue",loadOnStartup = 98)
public class PatientQueueServlet extends GenericServlet {

    public PatientQueueServlet(){
        System.out.println("Created PatientQueue servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from PatientQueue servlet");
    }
}
