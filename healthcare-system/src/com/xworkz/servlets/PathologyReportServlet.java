package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/pathologyReport",loadOnStartup = 53)
public class PathologyReportServlet extends GenericServlet {

    public  PathologyReportServlet(){
        System.out.println("Created PathologyReport servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from PathologyReport servlet");
    }
}
