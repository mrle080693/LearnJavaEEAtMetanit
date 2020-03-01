package com.mrle.learnjavaeeatmetanit.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/fourth")
public class FourthServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String[] nums = request.getParameterValues("nums");

        try {
            writer.print("<h2>Numbers: ");
            for (String n : nums)
                writer.print(n + " ");
            writer.println("</h2>");
        } finally {
            writer.close();
        }
        //http://localhost:8084/LearnJavaEEAtMetanit_war_exploded/fourth?nums=3&nums=23&nums=34
    }
}