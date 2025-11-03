package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/appointmentStatus",loadOnStartup = 37)
public class AppointmentStatusServlet extends GenericServlet {

    public  AppointmentStatusServlet(){
        System.out.println("Created AppointmentStatus servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from AppointmentStatus servlet");
    }
}
