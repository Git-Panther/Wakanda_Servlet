package com.kh.java;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MenuServlet
 */
@WebServlet("/menu.do")
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8"); // 요청값 중 한글이 있으면 한글 처리
		response.setContentType("text/html; charset=UTF-8"); // 보내는 값 중 한글이 있으면 처리
		
		String menu = request.getParameter("menu");
		//System.out.println("menu is " + menu + ".");
		String message = "Go to the "; 
		
		switch(menu){
		case "bloodsausagesoup":
			message += "Korean";
			break;
		case "mafatofu":
			message += "Chinese";
			break;
		case "katsudon":
			message += "Japanese";
			break;
		case "beefburger":
			message += "Fast";
			break;
		case "tomatospagetti":
			message += "Weston";
			break;
		}
		
		message += " food restaurant!";
		
		// foward
		RequestDispatcher rd = request.getRequestDispatcher("/menuAck.do");
		request.setAttribute("outputMessage", message);
		rd.forward(request, response);
	}

}
