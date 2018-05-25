package com.kh.java.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResearchJspServlet
 */
@WebServlet("/researchJsp.do")
public class ResearchJspServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResearchJspServlet() {
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
		
		String heroname = "";
		switch(hero){
		case "ironman":
			heroname = "Tony Stark";
			break;
		case "hulk":
			heroname = "Bruce Banner";
			break;
		case "thor":
			heroname = "Thor, Son of Odin";
			break;
		case "captainamerica":
			heroname = "Steve Rogers";
			break;
		case "blackwidow":
			heroname = "Natasha Romanorph";
			break;
		case "hawkeye":
			heroname = "Clint Flin";
			break;
		case "warmachine":
			heroname = "James Rod";
			break;
		}
		
		// 6가지 색상을 xml 형식으로  저장
		String stone = "None";
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
		
		String movie = "";
		if(movies != null){
			for(int i = 0; i < movies.length; i++){
				switch(movies[i]){
				case "ironman1":
					movie += "Iron Man";
					break;
				case "ironman2":
					movie += "Iron Man 2";
					break;	
				case "ironman3":
					movie += "Iron Man 3";
					break;
				case "incrediblehulk":
					movie += "Incredible Hulk";
					break;
				case "thor1":
					movie += "Thor : God of Thunder";
					break;
				case "thor2":
					movie += "Thor : The Dark World";
					break;
				case "thor3":
					movie += "Thor : Ragnarok";
					break;
				case "captainamerica1":
					movie += "Captain America : The First Avenger";
					break;
				case "captainamerica2":
					movie += "Captain America : The Winter Soldier";
					break;
				case "captainamerica3":
					movie += "Captain America : Civil War";
					break;
				case "avengers1":
					movie += "The Avengers";
					break;
				case "avengers2":
					movie += "The Avengers : Age of Ultron";
					break;
				case "avengers3":
					movie += "The Avengers : Infinity War";
					break;
				}
				
				if(i != movies.length - 1){
					movie += " / ";
				}
			}			
		} else{
			movie = "None";
		}
			
		// 이제 출력은 다른 데서 한다.
		RequestDispatcher rd = request.getRequestDispatcher("views/research.jsp"); // jsp 호출
		request.setAttribute("name", name);
		request.setAttribute("color", color);
		request.setAttribute("stone", stone);
		request.setAttribute("hero", heroname);
		request.setAttribute("movie", movie);
		
		rd.forward(request, response);
		/*
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
		*/
	}

}
