package com.mrle.learnjavaeeatmetanit.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
Set cookie to browser
Ну это очень утрировано. Получается что при запросе /set сервлет устанавливает куку с именем name и значением Tom.
Так и только так. На самом деле я думаю что это следует использовать например при использовании зарегестрированным
пользователем сайта. Хранить его корзину например.
 */
@WebServlet("/set")
public class SetCookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter printWriter = response.getWriter();
        try {
            response.addCookie(new Cookie("user", "Tom"));
            printWriter.println("Cookie is set");
        } finally {
            printWriter.close();
        }
    }
}
