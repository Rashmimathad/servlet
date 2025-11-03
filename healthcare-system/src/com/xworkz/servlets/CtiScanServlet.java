package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/ctiScan",loadOnStartup = 59)
public class CtiScanServlet extends GenericServlet {

    public CtiScanServlet(){
        System.out.println("Created CtiScan servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from CtiScan servlet");
    }
}
