package com.ohgiraffers.section02.annotation;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/annotation-lifecycle")        // mapping 명칭.
public class LifeCycleTestServlet extends HttpServlet {

    /* 기본 생성자 */
    public LifeCycleTestServlet() {
        System.out.println("annotation 방식 기본생성자 실행!");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("annotation 매핑 doDelete 메소드 호출");
    }

    /* 설명.
     *  서블릿 컨테이너에 의해 호출되며 최초 요청 시에만 init() 이후에 동작하고,
     *  두 번째 요청부터는 바로 service()만 호출하게 된다.
     * */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("annotation 매핑 service() 메소드 호출");
    }

    /* 컨테이너가 종료될 때 호출하는 메소드이며 주로 자원을 반납하는 용도로 사용 */
    @Override
    public void destroy() {
        System.out.println("annotation 매핑 destory() 메소드 호출");
    }

    /* 서블릿의 요청이 최초인 경우 서블릿 객체를 생성하고 자동으로 호출하게 하는 메소드 */
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("annotation 매핑 init() 메소드 호출!");
    }

    /* 설명.
     *  서블릿 라이프 사이클: init() -> service() 반복(doGet() 또는 doPost() 동작) -> destroy()
     * */
}
