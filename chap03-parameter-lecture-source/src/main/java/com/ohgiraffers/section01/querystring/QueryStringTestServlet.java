package com.ohgiraffers.section01.querystring;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

@WebServlet("/querystring")
public class QueryStringTestServlet extends HttpServlet {
    public QueryStringTestServlet() {
    }

    /* 설명. get 메소드로 넘기므로 doGet 사용 */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 설명. 넘어온 값들을 하나씩 처리하는 것을 파싱이라고 한다. */
        String name = req.getParameter("name");             // getParameter의 반환형은 무조건 String
        System.out.println("name = " + name);

        int age = Integer.valueOf(req.getParameter("age")); // String형으로 넘어오므로 Wrapper 클래스 사용
        System.out.println("age = " + age);

        java.sql.Date birthday = java.sql.Date.valueOf(req.getParameter("birthday"));
        System.out.println("birthday = " + birthday);

        String gender = req.getParameter("gender");
        System.out.println("gender = " + gender);

        String national = req.getParameter("national");
        System.out.println("national = " + national);

        /* 설명. 배열로 넘어오는 값을 변환. */
        String[] hobbies = req.getParameterValues("hobbies");
        System.out.println("Arrays.toString(hobbies) = " + Arrays.toString(hobbies));

    }
}
