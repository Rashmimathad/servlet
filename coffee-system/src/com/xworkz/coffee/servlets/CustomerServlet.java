package com.xworkz.coffee.servlets;

import com.xworkz.coffee.dto.CustomerDto;
import com.xworkz.coffee.service.CustomerService;
import com.xworkz.coffee.service.impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/customer",loadOnStartup = 1)
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("inputName");
        Long mobileNo = Long.parseLong(req.getParameter("inputMobileNo"));
        String coffeeFlavour = req.getParameter("inputCoffeeFlavour");
        Integer quantity = Integer.parseInt(req.getParameter("inputQuantity"));
        String paymentMode = req.getParameter("inputPaymentMode");


        req.setAttribute("name",name);
        req.setAttribute("mobileNo",mobileNo);
        req.setAttribute("coffeeFlavour",coffeeFlavour);
        req.setAttribute("quantity",quantity);
        req.setAttribute("paymentMode",paymentMode);

        req.getRequestDispatcher("CustomerResult.jsp").forward(req,resp);

        CustomerDto customerDto = new CustomerDto(name,mobileNo,coffeeFlavour,quantity,paymentMode);
        CustomerService customerService = new CustomerServiceImpl();
        customerService.validateAndSave(customerDto);
    }
}
