package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/wardAllocation",loadOnStartup = 41)
public class WardAllocationServlet extends GenericServlet {

    public WardAllocationServlet(){
        System.out.println("Created WardAllocation servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from WardAllocation servlet");
    }
}
