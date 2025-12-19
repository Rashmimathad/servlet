package com.xworkz.iplbiddingapp.servlet;

import com.xworkz.iplbiddingapp.dto.BidPlayerDTO;
import com.xworkz.iplbiddingapp.exceptions.DataInvalidException;
import com.xworkz.iplbiddingapp.service.BiddingService;
import com.xworkz.iplbiddingapp.service.impl.BiddingServiceImpl;
import com.xworkz.iplbiddingapp.utility.NumberValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/playerBid",loadOnStartup = 1)
public class PlayerBidServlet extends HttpServlet {

    private BiddingService biddingService = new BiddingServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        double price = NumberValidation.parseDoubleSafe(req.getParameter("price"));
       String companyName = req.getParameter("companyName");

        try{
            BidPlayerDTO bidPlayerDTO = new BidPlayerDTO(name,price,companyName);
           boolean isValidatedAndBidded = biddingService.validateAndBid(bidPlayerDTO);
           if (isValidatedAndBidded){
               req.setAttribute("successMsg","Player Bid done Successfully Please wait for the results");
           }
        }catch (Exception e){
            req.setAttribute("errorMsg","Player not Available to Bid!!!");
        }

        req.getRequestDispatcher("BidResponse.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = NumberValidation.parseIntSafe(req.getParameter("playerId"));

        try{
           String playerName =  biddingService.bidPlayer(id);

           if (!playerName.isEmpty()){
               req.setAttribute("playerName",playerName);
           }
        }catch (DataInvalidException e){
            e.printStackTrace();
        }

        req.getRequestDispatcher("PlayerBidPage.jsp").forward(req,resp);
    }
}
