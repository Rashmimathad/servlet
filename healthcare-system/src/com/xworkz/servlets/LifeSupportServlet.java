package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/lifeSupport",loadOnStartup = 61)
public class LifeSupportServlet extends GenericServlet {

    public LifeSupportServlet(){
        System.out.println("Created LifeSupport servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from LifeSupport servlet");
    }
}
