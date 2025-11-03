package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/generateBill",loadOnStartup = 26)

public class GenerateBillServlet extends GenericServlet {

    public GenerateBillServlet(){
        System.out.println("Created GenerateBill servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from GenerateBill servlet");
    }
}
