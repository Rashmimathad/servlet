package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/coffee",loadOnStartup = 1)
public class CoffeeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String coffeeType =req.getParameter("coffeeType");
       Double price = Double.parseDouble(req.getParameter("inputPrice"));
       Integer quantity =Integer.parseInt(req.getParameter("inputQuantity"));
       String farmerName=req.getParameter("inputFarmerName");
       String location=req.getParameter("inputLocation");

        req.setAttribute("coffeeType",coffeeType);
        req.setAttribute("price",price);
        req.setAttribute("quantity",quantity);
        req.setAttribute("farmerName",farmerName);
        req.setAttribute("location",location);
        req.setAttribute("totalCost",price*quantity);

        req.getRequestDispatcher("CoffeeResult.jsp").forward(req,resp);
    }
}
