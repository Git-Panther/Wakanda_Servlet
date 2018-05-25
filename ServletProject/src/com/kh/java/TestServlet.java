package com.kh.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test.do")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		// 요청값 중 한글이 있으면 한글 처리
		response.setContentType("text/html; charset=UTF-8");
		// 보내는 값 중 한글이 있으면 처리
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>What is Servlet?</title></head>");
		out.println("<body>");
		out.println("<h1>What is Servlet?</h1>");
		out.println("<h3>서블릿은 서버의 기능과 화면을 구성하는 HTML 소스를 같이 저장하고 있다.<br>"
				+ "클라이언트의 요청 값을 받을 수 있다.<br>"
				+ "화면을 구성하는 기능과 서버의 기능을 값이 구현하는 기술을 Servlet이라고 한다.</h3>");
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
