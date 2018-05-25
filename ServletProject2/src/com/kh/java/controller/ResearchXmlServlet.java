package com.kh.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResearchXmlServlet
 */
//@WebServlet("/researchXml.do")
public class ResearchXmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResearchXmlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 한글 인코딩
		//request.setCharacterEncoding("UTF-8");
		//response.setContentType("text/html; charset=UTF-8");
		
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
		
		// 6가지 색상을 xml 형식으로  저장
		String stone = "none";
		if(color != null){
			switch(color){
			case "purple":
				stone = "Power Stone";
				break;
			case "blue":
				stone = "Space Stone";
				break;
			case "red":
				stone = "Reality Stone";
				break;
			case "orange":
				stone = "Soul Stone";
				break;
			case "green":
				stone = "Time Stone";
				break;
			case "yellow":
				stone = "Mind Stone";
				break;
			}
		}	
		
		// movieStr : 선택한 영화의 이름으로 출력. 현재는 switch 문 사용이 최선.
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Your Style</title>");
		out.println("<style>span{color:skyblue; font-weight:bold;}</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Result by Post</h1>");
		out.println("<span>Name : "
				+ name + "<br></span>");
		out.println("<span>Color : "
				+ color + "<br></span>");
		out.println("<span>Hero : "
				+ hero + "<br></span>");
		out.print("<span>");
		if(movies != null){
			out.print("Movies");
			String movieStr = "";
			for(int i = 0; i < movies.length; i++){
				switch(movies[i]){
				case "ironman1":
					movieStr = "Iron Man";
					break;
				case "ironman2":
					movieStr = "Iron Man 2";
					break;	
				case "ironman3":
					movieStr = "Iron Man 3";
					break;
				case "incrediblehulk":
					movieStr = "Incredible Hulk";
					break;
				case "thor1":
					movieStr = "Thor : God of Thunder";
					break;
				case "thor2":
					movieStr = "Thor : The Dark World";
					break;
				case "thor3":
					movieStr = "Thor : Ragnarok";
					break;
				case "captainamerica1":
					movieStr = "Captain America : The First Avenger";
					break;
				case "captainamerica2":
					movieStr = "Captain America : The Winter Soldier";
					break;
				case "captainamerica3":
					movieStr = "Captain America : Civil War";
					break;
				case "avengers1":
					movieStr = "The Avengers";
					break;
				case "avengers2":
					movieStr = "The Avengers : Age of Ultron";
					break;
				case "avengers3":
					movieStr = "The Avengers : Infinity War";
					break;
				}	
				out.print("<br>" + (i+1) + "." + movieStr);
			}
			
		} else{
			out.print("No movie is chosen.");
		}
		out.println("<br></span>");
		out.println("<hr><p>Your Infinity Stone is "
				+ stone + ".<br></p>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		
		// 관리하기를 원한다면 xml 방식, 쓰기 편하게 하고 싶다면 annotation 방식
	}

}
