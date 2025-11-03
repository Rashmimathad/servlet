package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/nurseShift",loadOnStartup = 28)
public class NurseShiftServlet extends GenericServlet {

    public NurseShiftServlet(){
        System.out.println("Created NurseShift servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from NurseShift servlet");
    }
}
