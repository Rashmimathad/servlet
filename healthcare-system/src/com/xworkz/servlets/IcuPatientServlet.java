package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/icuPatient",loadOnStartup = 49)
public class IcuPatientServlet extends GenericServlet {

    public IcuPatientServlet(){
        System.out.println("Created IcuPatient servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from IcuPatient servlet");
    }
}
