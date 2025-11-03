package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/operationTheatre",loadOnStartup = 19)
public class OperationTheatreServlet extends GenericServlet {

    public OperationTheatreServlet(){
        System.out.println("Created OperationTheatre servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from OperationTheatre servlet");
    }
}
