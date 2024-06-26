package com.roger.demo.lesson2.exercise;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login2")
public class Login extends HttpServlet {
    String header =
            "<!DOCTYPE html>" +
                    "<html>" +
                    "<head>" +
                    "<meta charset='UTF-8'>" +
                    "<title>Login Result</title>" +
                    "</head>" +
                    "<body>";
    String footer =
            "</body>" +
                    "</html>";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        out.printf(header);
        if ("caterpillar".equals(username) && "12345678".equals(password)) {
            out.print("<h1>登入成功</h1>");
        } else {
            out.print("<h1>登入失敗</h1><br>");
            out.print("<a href='login2.html'>回登入表單</a>");
        }
        out.print(footer);

    }
}
