package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

import java.io.IOException;

@WebFilter("/member/*")
public class PasswordEncryptFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("패스워드 암호화 필터의 doFilter 실행");

        RequestWrapper wrapper = new RequestWrapper((HttpServletRequest)(servletRequest));

        filterChain.doFilter(wrapper, servletResponse);
    }

    @Override
    public void destroy() {
    }
}
