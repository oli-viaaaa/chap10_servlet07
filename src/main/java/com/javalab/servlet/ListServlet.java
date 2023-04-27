package com.javalab.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/list")
public class ListServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
						HttpServletResponse response) 
						throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> membersList = dao.listMembers();
		
		// 조회 결과를 request 영역에 저장
		request.setAttribute("memberList", membersList);
		
		// 프로그램의 흐름을 다른 서블릿/화면으로 이동(second 라는 서블릿으로 이동)
		// 사용자에게 새로운 요청을 일으키지 않고 JSP 화면으로 직접 이동
		RequestDispatcher dispatcher = request.getRequestDispatcher("memberList2.jsp");
		dispatcher.forward(request, response);
	}
}
