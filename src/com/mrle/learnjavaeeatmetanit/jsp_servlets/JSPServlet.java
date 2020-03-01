package com.mrle.learnjavaeeatmetanit.jsp_servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/returnjsp")
public class JSPServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Контекст запроса
        request.setAttribute("name", "Tom");
        request.setAttribute("age", 34);
        String[] users = new String[]{"Tom", "Bob", "Sam"};
        request.setAttribute("users", users);

        // Контекст приложения
        /*
        ServletContext selvletContext = getServletContext();
    	selvletContext.setAttribute("name", "Tom");
    	selvletContext.setAttribute("age", 35);
        */

        // Контекст сессии
        /*
        HttpSession session = request.getSession();
    	session.setAttribute("name", "Tom");
    	session.setAttribute("age", 34);
        */

        getServletContext().getRequestDispatcher("/five.jsp").forward(request, response);
    }
}
