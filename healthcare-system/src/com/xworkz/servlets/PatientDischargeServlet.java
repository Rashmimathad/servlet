package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/patientDischarge",loadOnStartup = 32)
public class PatientDischargeServlet extends GenericServlet {

    public PatientDischargeServlet(){
        System.out.println("Created PatientDischarge servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from PatientDischarge servlet");
    }
}
