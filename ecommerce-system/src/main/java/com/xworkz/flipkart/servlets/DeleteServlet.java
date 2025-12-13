package com.xworkz.flipkart.servlets;

import com.xworkz.flipkart.service.FlipkartService;
import com.xworkz.flipkart.service.impl.FlipkartServiceImpl;
import com.xworkz.flipkart.utility.NumberValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/delete",loadOnStartup = 1)
public class DeleteServlet extends HttpServlet {

    private FlipkartService flipkartService = new FlipkartServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String id = req.getParameter("userId");
       if (id!=null && !id.isEmpty()){
           int userId = NumberValidation.parseIntSafe(id);
           flipkartService.validateAndDelete(userId);
           req.setAttribute("successMessage", "Profile Deleted!!!");
       }else {
           req.setAttribute("errorMessage", "Profile Not Deleted!!!");
       }
       req.getRequestDispatcher("DeleteResponse.jsp").forward(req,resp);
    }
}
