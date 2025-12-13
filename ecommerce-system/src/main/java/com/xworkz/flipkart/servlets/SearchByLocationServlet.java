package com.xworkz.flipkart.servlets;

import com.xworkz.flipkart.dto.FlipkartUserDTO;
import com.xworkz.flipkart.dto.SearchDTO;
import com.xworkz.flipkart.service.FlipkartService;
import com.xworkz.flipkart.service.impl.FlipkartServiceImpl;
import com.xworkz.flipkart.utility.NumberValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = "/searchByLocation",loadOnStartup = 1)
public class SearchByLocationServlet extends HttpServlet {


    private final FlipkartService flipkartService = new FlipkartServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String submitType = req.getParameter("submitType");
        if ("Clear".equalsIgnoreCase(submitType)){
            System.out.println("Data Cleared...");
            req.setAttribute("dto",null);
        }else {
            String address = req.getParameter("inputAddress");
            if (address!=null&&!address.isEmpty()) {
                List<FlipkartUserDTO> searchDetails = flipkartService.validateLocation(new SearchDTO(address));
                if (searchDetails.isEmpty()) {
                    System.err.println("Users not found");
                    req.setAttribute("errorMessage", "Users not found!!");
                }
                else
                    req.setAttribute("dto", searchDetails);
            }
        }
        req.getRequestDispatcher("SearchByLocationPage.jsp").forward(req,resp);
    }
}
