package com.kh.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResearchGetServlet
 */
@WebServlet("/researchGet.do")
public class ResearchGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResearchGetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// 한글 인코딩
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// 값 가져오기
		String name = request.getParameter("name");
		String color = request.getParameter("color");
		String hero = request.getParameter("hero");
		String[] movies = request.getParameterValues("movie");
		/*
		System.out.println(color + "/" + hero);
		if(movies != null){
			for(String movie : movies){
				System.out.println(movie);
			}
		} else{
			System.out.println("No movie is chosen.");
		}
		*/
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Your Style</title>");
		out.println("<style>span{color:skyblue; font-weight:bold;}</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Result by Get</h1>");
		out.println("<span>Name : "
				+ name + "<br></span>");
		out.println("<span>Color : "
				+ color + "<br></span>");
		out.println("<span>Hero : "
				+ hero + "<br></span>");
		out.print("<span>");
		if(movies != null){
			out.print("Movies : ");
			for(String movie : movies){
				out.print(movie + " ");
			}
			
		} else{
			out.print("No movie is chosen.");
		}
		out.println("<br></span>");			
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}

}
