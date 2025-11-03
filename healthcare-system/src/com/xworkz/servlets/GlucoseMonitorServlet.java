package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/glucoseMonitor",loadOnStartup = 86)
public class GlucoseMonitorServlet extends GenericServlet {

    public GlucoseMonitorServlet(){
        System.out.println("Created GlucoseMonitor servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from GlucoseMonitor servlet");
    }
}
