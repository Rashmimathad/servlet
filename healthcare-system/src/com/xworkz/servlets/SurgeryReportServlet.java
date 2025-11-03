package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/surgeryReport",loadOnStartup = 75)
public class SurgeryReportServlet extends GenericServlet {

    public SurgeryReportServlet(){
        System.out.println("Created SurgeryReport servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from SurgeryReport servlet");
    }
}
