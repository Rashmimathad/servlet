package com.xworkz.flipkart.servlets;

import com.xworkz.flipkart.dto.FlipkartUserDTO;
import com.xworkz.flipkart.service.FlipkartService;
import com.xworkz.flipkart.service.impl.FlipkartServiceImpl;
import com.xworkz.flipkart.utility.NumberValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/searchByContact",loadOnStartup = 1)
public class SearchServlet extends HttpServlet {
    private final FlipkartService flipkartService = new FlipkartServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String contactNo =req.getParameter("inputContactNumber");
       if (contactNo!=null && !contactNo.isEmpty()) {
           long contactNumber = NumberValidation.parseLongSafe(contactNo);
           Optional<FlipkartUserDTO> searchDetails = flipkartService.validateContactNumber(contactNumber);
           if (searchDetails.isPresent()) {
               req.setAttribute("dto", searchDetails.get());
           } else {
               req.setAttribute("errorMessage", "Contact Number not found!!");
           }
       }
        req.getRequestDispatcher("SearchPage.jsp").forward(req, resp);
    }
}
