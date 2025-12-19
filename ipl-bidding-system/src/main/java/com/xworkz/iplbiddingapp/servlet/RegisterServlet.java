package com.xworkz.iplbiddingapp.servlet;

import com.xworkz.iplbiddingapp.dto.PlayerDTO;
import com.xworkz.iplbiddingapp.exceptions.DataInvalidException;
import com.xworkz.iplbiddingapp.exceptions.DuplicatePlayerException;
import com.xworkz.iplbiddingapp.service.BiddingService;
import com.xworkz.iplbiddingapp.service.impl.BiddingServiceImpl;
import com.xworkz.iplbiddingapp.utility.NumberValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/registerPlayer",loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {

    private BiddingService biddingService = new BiddingServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String name = req.getParameter("playerName");
            int age = NumberValidation.parseIntSafe(req.getParameter("age"));
            String state = req.getParameter("state");
            String playerType = req.getParameter("playerType");
            double battingAvg = NumberValidation.parseDoubleSafe(req.getParameter("battingAvg"));
            double bowlerAvg = NumberValidation.parseDoubleSafe(req.getParameter("bowlerAvg"));
            int noOfStumps = NumberValidation.parseIntSafe(req.getParameter("noOfStumps"));

            try{
                PlayerDTO playerDTO = new PlayerDTO(name,age,state,playerType,battingAvg,bowlerAvg,noOfStumps);
                 boolean isValidatedAndSaved = biddingService.validateAndSave(playerDTO);
                 if (isValidatedAndSaved){
                     System.out.println(playerDTO);
                     req.setAttribute("dto",playerDTO);
                     req.setAttribute("successMsg","Data Saved Successfully!!");
                 }
            } catch (DataInvalidException | DuplicatePlayerException e) {
                req.setAttribute("errorMsg",e.getMessage());
                e.printStackTrace();
            }
        req.getRequestDispatcher("RegisterResponse.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("RegisterPlayerForm.jsp").forward(req,resp);
    }
}
