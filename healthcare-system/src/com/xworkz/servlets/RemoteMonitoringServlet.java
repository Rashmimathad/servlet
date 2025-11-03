package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/remoteMonitoring",loadOnStartup = 80)
public class RemoteMonitoringServlet extends GenericServlet {

    public RemoteMonitoringServlet(){
        System.out.println("Created RemoteMonitoring servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service from remoteMonitoring servlet");
    }
}
