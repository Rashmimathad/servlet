package com.xworkz.coffee.servlets;

import com.xworkz.coffee.dto.CustomerFeedbackDto;
import com.xworkz.coffee.service.CustomerFeedbackService;
import com.xworkz.coffee.service.impl.CustomerFeedbackServiceImpl;

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

        CustomerFeedbackDto customerFeedbackDto = new CustomerFeedbackDto(name,email,comments,customerRating);
        CustomerFeedbackService customerFeedbackService = new CustomerFeedbackServiceImpl();
        customerFeedbackService.validateAndSave(customerFeedbackDto);
    }
}
