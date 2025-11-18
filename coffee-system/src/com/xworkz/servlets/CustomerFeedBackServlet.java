package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/customerFeedback",loadOnStartup = 1)
public class CustomerFeedBackServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("inputName");
        String email = req.getParameter("inputEmail");
        String comments =  req.getParameter("inputComments");
        Double customerRating = Double.parseDouble(req.getParameter("inputRating"));

        req.setAttribute("name",name);
        req.setAttribute("email",email);
        req.setAttribute("comments",comments);
        req.setAttribute("customerRating",customerRating);

        req.getRequestDispatcher("CustomerFeedBackResult.jsp").forward(req,resp);
    }
}
