package com.kh.java.listener.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ListenerServlet
 */
@WebServlet("/listener.li")
public class ListenerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListenerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		if(session != null){
			// 세션에 저장된 값을 삭제
			session.invalidate();
		}
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Test Listener</title></head>");
		out.println("<body>");
		out.println("<form method='get' action='listenerAck.li'>");
		out.println("Name : <input type='text' name='name'/>");
		out.println("<input type='submit' value='Submit'/>");
		out.println("</form>");
		out.println("<hr><a href='/twp/index.html'>Go to Main Page</a>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
