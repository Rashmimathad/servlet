package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/pharmacy",loadOnStartup = 7)
public class PharmacyServlet extends GenericServlet {

    public PharmacyServlet(){
        System.out.println("Created Pharmacy servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from Pharmacy servlet");
    }
}
