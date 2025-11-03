package com.xworkz.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/chatSupport",loadOnStartup = 97)
public class ChatSupportServlet extends GenericServlet {

    public ChatSupportServlet(){
        System.out.println("Created ChatSupport servlet");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service from ChatSupport servlet");
    }
}
