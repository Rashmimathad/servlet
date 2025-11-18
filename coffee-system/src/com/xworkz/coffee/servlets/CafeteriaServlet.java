package com.xworkz.coffee.servlets;

import com.xworkz.coffee.dto.CafeteriaDto;
import com.xworkz.coffee.service.CafeteriaService;
import com.xworkz.coffee.service.impl.CafeteriaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cafeteria",loadOnStartup = 1)
public class CafeteriaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cafeteriaName = req.getParameter("cafeteriaName");
        String location = req.getParameter("inputLocation");
        String type = req.getParameter("inputCafeteriaType");
        Double price = Double.parseDouble(req.getParameter("inputPrice"));
        String franchiseName = req.getParameter("inputFranchiseName");
        String ownerName = req.getParameter("inputOwnerName");
        String gstNo = req.getParameter("inputGstNo");

        req.setAttribute("cafeteriaName",cafeteriaName);
        req.setAttribute("location",location);
        req.setAttribute("type",type);
        req.setAttribute("price",price);
        req.setAttribute("franchiseName",franchiseName);
        req.setAttribute("ownerName",ownerName);
        req.setAttribute("gstNo",gstNo);

        req.getRequestDispatcher("CafeteriaResult.jsp").forward(req,resp);
        CafeteriaDto cafeteriaDto = new CafeteriaDto(cafeteriaName,location,type,price,franchiseName,ownerName,gstNo);
        CafeteriaService cafeteriaService = new CafeteriaServiceImpl();
        cafeteriaService.validateAndSave(cafeteriaDto);
    }
}
