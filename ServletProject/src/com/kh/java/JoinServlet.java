package com.kh.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// 한글 인코딩
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// 값 가져오기
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		String username = request.getParameter("username");
		String useremail = request.getParameter("useremail");
		String usertel1 = request.getParameter("usertel1");
		String usertel2 = request.getParameter("usertel2");
		String usertel3 = request.getParameter("usertel3");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] hobbies = request.getParameterValues("hobby");
		
		// 화면 구성
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>회원 가입 완료</title></head>");
		out.println("<body>");
		out.println("<h1>Sign Up Success!</h1>");
		out.println("<h3>Your Information</h3>");
		out.println("<p>ID : " + userid + "</p>");
		out.println("<p>PW : " + userpw + "</p>");
		out.println("<p>name : " + username + "</p>");
		out.println("<p>email : " + useremail + "</p>");
		out.println("<p>Tel : " + usertel1 + "-" + usertel2 + "-" + usertel3 + "</p>");
		out.println("<p>gender : " + (gender.equals("m") ? "male" : "female") + "</p>");
		out.println("<p>job : " + job + "</p>");
		if(hobbies != null){
			out.print("<p>hobby : ");
			for(String hobby : hobbies){
				out.print(hobby + " ");
			}
			out.println("</p>");
		}
		out.println("<hr>");
		out.println("<a href='/ServletProject/index.html'>Back</a>");
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
