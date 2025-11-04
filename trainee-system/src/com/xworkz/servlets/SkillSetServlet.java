package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/skillSet",loadOnStartup = 1)
public class SkillSetServlet extends GenericServlet {

    public SkillSetServlet(){
        System.out.println("Created SkillSet servlet");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{
        System.out.println("Running service in SkillSet servlet");
        System.out.println("Name : "+req.getParameter("name"));
        System.out.println("Email : "+req.getParameter("email"));
        System.out.println("Primary Skills : "+req.getParameter("primarySkills"));
        System.out.println("Secondary Skills : "+req.getParameter("secondarySkills"));
        System.out.println("Database : "+req.getParameter("db"));
        System.out.println("IDE's : "+req.getParameter("ide"));
        System.out.println("UI Technologies : "+req.getParameter("ui"));
        System.out.println("Frameworks : "+req.getParameter("framework"));
    }
}
