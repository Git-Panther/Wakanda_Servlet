package com.kh.java.scope.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ScopeServlet
 */
@WebServlet("/scope.do")
public class ScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScopeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// 이미 Filter가 한글 인코딩 처리함
		
		int num1 = Integer.parseInt(request.getParameter("num1")); // 무조건 String Byte 단위로 전송되므로 파싱해줘야 한다.
		int num2 = Integer.parseInt(request.getParameter("num2")); // 여기서 예외처리당할 수 있기에 html 쪽에서 그냥 number 입력 형식으로 제한하는 게 좋다.
		
		int sum = num1 + num2; // page : response
		request.setAttribute("requestSum", sum); // 속성 추가
		HttpSession session = request.getSession(); // Session
		session.setAttribute("sessionSum", sum);
		ServletContext application = getServletContext(); // Application(Context)
		application.setAttribute("applicationSum", sum);
		
		RequestDispatcher rd = request.getRequestDispatcher("scopeAck.do"); // Servlet에서 Servlet 호출(현재 위치 기준으로 호출)
		rd.forward(request, response);
		
		System.out.println(num1 + " / " + num2);
	}

}
