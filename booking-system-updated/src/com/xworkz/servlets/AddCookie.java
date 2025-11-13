package com.xworkz.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
@WebServlet(urlPatterns = "/addCookie",loadOnStartup = 1)
public class AddCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789"; String special = "!@#$%^&*()-_=+<>?/";
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            result.append(upper.charAt(random.nextInt(upper.length())));
        }
        for (int i = 0; i < 5; i++)
        {
            result.append(lower.charAt(random.nextInt(lower.length())));
        }
        for (int i = 0; i < 5; i++) {
            result.append(digits.charAt(random.nextInt(digits.length())));
        }
        for (int i = 0; i < 5; i++) {
            result.append(special.charAt(random.nextInt(special.length())));
        }
        List<Character> chars = new ArrayList<>();
        for (char c : result.toString().toCharArray()) {
            chars.add(c);
        }
        Collections.shuffle(chars, random);
        StringBuilder finalValue = new StringBuilder();
        for (char c : chars) {
            finalValue.append(c);
        }
        Cookie cookie=new Cookie("X-workz",finalValue.toString());
        resp.addCookie(cookie);
        cookie.setPath("/");
        resp.sendRedirect("index.html");
        Cookie[]  cookies=req.getCookies();
        if (cookies==null||cookies.length<1){
            throw new IllegalArgumentException("Cookie not found!!!");
        }
        for (Cookie cookie1:cookies){
            System.out.println(cookie1.getName()+" "+cookie1.getValue());
        }
    }
}
