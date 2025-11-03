package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/doctorsList",loadOnStartup = 31)
public class DoctorsListServlet extends GenericServlet {

    public DoctorsListServlet(){
        System.out.println("Created DoctorsList servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from DoctorsList servlet ");
    }
}
