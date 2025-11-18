package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/coffeeLand",loadOnStartup = 1)
public class CoffeeLandServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double sizeInAcre =Double.parseDouble(req.getParameter("inputSizeByAcre"));
        Integer totalPants = Integer.parseInt(req.getParameter("inputTotalPlants"));
        Double totalYield =Double.parseDouble(req.getParameter("inputTotalYield"));
        Double expenditure=Double.parseDouble(req.getParameter("inputExpenditure"));
        Double profitMade=Double.parseDouble(req.getParameter("inputProfitMade"));
        Integer fertilizerQuantityUsed = Integer.parseInt(req.getParameter("inputFertilizerQuantityUsed"));

        req.setAttribute("sizeInAcre",sizeInAcre);
        req.setAttribute("totalPants",totalPants);
        req.setAttribute("totalYield",totalYield);
        req.setAttribute("expenditure",expenditure);
        req.setAttribute("profitMade",profitMade);
        req.setAttribute("fertilizerQuantityUsed",fertilizerQuantityUsed);
        req.getRequestDispatcher("CoffeeLandResult.jsp").forward(req,resp);
    }
}
