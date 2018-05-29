package com.kh.java.scope.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ScopeAckServlet
 */
@WebServlet("/scopeAck.do")
public class ScopeAckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScopeAckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// request, session, application scope의 값 저장
		int reqSum = (request.getAttribute("requestSum") == null? 0 : (Integer)request.getAttribute("requestSum"));
		
		HttpSession session = request.getSession(false); // 만일 기존 session 값이 넘어온 게 있다면 그것을 반환.	
		int sessionSum = ((Integer)session.getAttribute("sessionSum") == null? 0 : (Integer)session.getAttribute("sessionSum"));
		
		ServletContext application = getServletContext(); // 만일 기존 context 값이 넘어온 게 있다면 그것을 반환.
		int applicationSum = ((Integer)application.getAttribute("applicationSum") == null? 0 : (Integer)application.getAttribute("applicationSum"));
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Test the Scope</title></head>");
		out.print("<body>");
		out.print("<h2>page Area</h2>");
		out.print("<p>The scope of values on the page. It disappears when you leave the page.</p>");
		out.print("<h2>request Area</h2>");
		out.print("<p>The scope of values ​​that exist to the area that is passed between each page</p>");
		out.print("Result : " + reqSum + "<br>");
		out.print("<h2>session Area</h2>");
		out.print("<p>The scope of values ​​that exist while the connection with the application is maintained.</p>");
		out.print("Result : " + sessionSum + "<br>"); // 웹 브라우저가 켜진 동안 남음
		out.print("<h2>application Area</h2>");
		out.print("<p>The scope of values ​​that exist while the application is running</p>");
		out.print("Result : " + applicationSum + "<br>"); // 서버가 켜져있는 한 웹 브라우저가 종료되어도 남음
		out.print("<a href='/twp/index.html'><br>Go to Main Page</a>");
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
