package com.mrle.learnjavaeeatmetanit.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SevenServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get parameter for all servlets from web.xml
        String globalParameter = getServletContext().getInitParameter("globalParameter");
        // Get this servlet parameter from web.xml
        String parameter = getServletConfig().getInitParameter("parameter");
        PrintWriter writer = response.getWriter();
        try {
            writer.println(parameter + " " + globalParameter);
        } finally {
            writer.close();
        }
    }
}
