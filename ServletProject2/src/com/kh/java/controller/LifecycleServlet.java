package com.kh.java.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifecycleServlet
 */
@WebServlet("/lifecycle.do")
public class LifecycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifecycleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException { // 처음 시작할 때
		// TODO Auto-generated method stub
		System.out.println("init() called."); 
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() { // 마지막에 서버 닫을 때
		// TODO Auto-generated method stub
		System.out.println("destroy() called."); 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// Get 방식으로 페이지 불러올 때마다
		System.out.println("doGet() called."); 
	}

}
