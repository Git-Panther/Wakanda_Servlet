package com.kh.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginErrorServlet
 */
@WebServlet("/login2Ack.do")
public class LoginErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginErrorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// request.setCharacterEncoding("UTF-8"); // 요청값 중 한글이 있으면 한글 처리. // 받을 값이 없으면 굳이 할 필요 없음
		response.setContentType("text/html; charset=UTF-8"); // 보내는 값 중 한글이 있으면 처리
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Error Page</title></head>");
		out.println("<body>");
		out.println("<h1>로그인 에러.</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush(); // 값 내보내기
		out.close(); // 출력 닫기
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
