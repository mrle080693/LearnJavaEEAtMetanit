package com.mrle.learnjavaeeatmetanit.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        Person tom = (Person) session.getAttribute("person");

        PrintWriter printWriter = response.getWriter();
        try {
            if(tom == null) {

                tom = new Person("Tom", 34);
                session.setAttribute("person", tom);
                printWriter.println("Session data are set");
            }
            else {
                printWriter.println("Name: " + tom.getName() + " Age: " + tom.getAge());
                session.removeAttribute("person");
            }
        }
        finally {
            printWriter.close();
        }
    }
}
