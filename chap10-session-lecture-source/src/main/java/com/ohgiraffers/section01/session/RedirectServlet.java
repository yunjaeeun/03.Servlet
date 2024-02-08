package com.ohgiraffers.section01.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

    /* redirect는 요청을 보내면 url로 받기 때문에 무조건 doGet으로 받음 */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 설명. 리다이렉트로 넘어온 서블릿이더라도 같은 JSESSIONID가 넘어왔을 것이므로 기존과 같은 session 객체가 생성된다. */
        HttpSession session = req.getSession();         // session 만료시간이 지났으면 새로 만듦

        String firstName = (String) session.getAttribute("firstName");       // getAttribute는 object형이므로 형변환
        String lastName = (String) session.getAttribute("lastName");

        StringBuilder responseText = new StringBuilder();
        responseText.append("<h3>your firstName is ")
                .append(firstName)
                .append("\n and lastName is ")
                .append(lastName)
                .append("</h3>");

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.print(responseText);
        out.flush();
        out.close();


    }
}
