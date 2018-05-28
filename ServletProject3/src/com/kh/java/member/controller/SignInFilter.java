package com.kh.java.member.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class SignInFilter
 */
@WebFilter("/signin.do")
public class SignInFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SignInFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		HttpServletRequest originRequest = (HttpServletRequest)request; // Wrapper 생성자를 호출하기 위해 강제로 형변환
		SignInWrapper siw = new SignInWrapper(originRequest); // 생성자를 호출하여 객체 생성	
		
		// pass the request along the filter chain
		chain.doFilter(siw, response); // Wrapper를 씌우고 Wrapper를 보내줘야 처리가 적용되니 주의
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
