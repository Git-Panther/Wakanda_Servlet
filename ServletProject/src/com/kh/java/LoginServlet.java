package com.kh.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8"); // 요청값 중 한글이 있으면 한글 처리
		response.setContentType("text/html; charset=UTF-8"); // 보내는 값 중 한글이 있으면 처리
		
		// 전송된 값의 name을 통해 값 가져오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//System.out.println("ID is " + id + ".");
		//System.out.println("Password is " + pw + ".");
		// Servlet 작동을 위해서는 서버를 닫았다 열어야 한다. 즉, 점검은 프로그램을 수정하기 위해 서버를 닫아야 하기 때문.
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Result</title></head>");
		out.println("<body>");
		out.println("<h3>ID is " + id + ".<br>"
				+ "Password is " + pw + "."
				+ "</h3>");
		// 신기하게도, 서버를 닫았다 열 필요도 없이 자동으로 갱신된다...
		// 안전을 위해서는 서버 닫았다 여는 게 좋을 듯.
		// 사실, 파일을 새로 생성하거나 삭제하면 서버를 다시 여는 것. 이미 존재하는 파일 수정에 관해서는 바로 갱신이 되기에 수정하는 것은 굳이 닫을 필요 없다...?
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
