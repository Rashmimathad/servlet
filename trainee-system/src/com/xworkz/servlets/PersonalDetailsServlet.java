package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/personalDetails",loadOnStartup = 1)
public class PersonalDetailsServlet extends GenericServlet {

    public PersonalDetailsServlet(){
        System.out.println("Created PersonalDetails servlet");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{
        System.out.println("Running service in PersonalDetails servlet");
        System.out.println("Name : "+req.getParameter("name"));
        System.out.println("Email : "+req.getParameter("email"));
        System.out.println("Mobile No : "+req.getParameter("mobileNo"));
        System.out.println("Address : "+req.getParameter("address"));
        System.out.println("Gender : "+req.getParameter("gender"));
        System.out.println("DOB : "+req.getParameter("dob"));
        System.out.println("Status : "+req.getParameter("status"));
        System.out.println("------------------------------------------------------");

    }
}
