package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/doctorDashboard",loadOnStartup = 36)
public class DoctorDashboardServlet extends GenericServlet {

    public DoctorDashboardServlet(){
        System.out.println("Created DoctorDashboard servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from DoctorDashboard servlet");
    }
}
