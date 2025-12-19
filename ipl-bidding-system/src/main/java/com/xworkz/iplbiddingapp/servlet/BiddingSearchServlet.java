package com.xworkz.iplbiddingapp.servlet;

import com.xworkz.iplbiddingapp.exceptions.DataInvalidException;
import com.xworkz.iplbiddingapp.service.BiddingService;
import com.xworkz.iplbiddingapp.service.impl.BiddingServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/bidding",loadOnStartup = 1)
public class BiddingSearchServlet extends HttpServlet {

    private BiddingService biddingService = new BiddingServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");

        try{
         String companyName = biddingService.validateEmail(email);
         if (companyName == ""){
             req.setAttribute("errorMsg","Company not found!!");
             req.getRequestDispatcher("BiddingPage.jsp").forward(req,resp);
         }else{
            HttpSession httpSession = req.getSession(true);
            httpSession.setAttribute("companyName",companyName);
        }
        req.getRequestDispatcher("PlayerSearchPage.jsp").forward(req,resp);
         }catch (DataInvalidException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("BiddingPage.jsp").forward(req,resp);
    }
}
