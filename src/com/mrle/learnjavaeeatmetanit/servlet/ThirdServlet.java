package com.mrle.learnjavaeeatmetanit.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String result = name + " " + age;

        try {
            writer.println(result);
        } finally {
            writer.close();
        }
        //http://localhost:8084/LearnJavaEEAtMetanit_war_exploded/third?name=Carl&age=23
    }
}
