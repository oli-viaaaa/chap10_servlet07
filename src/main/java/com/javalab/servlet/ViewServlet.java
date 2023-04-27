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
@WebServlet("/view")
public class ViewServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);	
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 사용자가 입력한 한글 정보의 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		// 2. 시용자에게 보낼 컨텐츠의 인코딩 처리
		response.setContentType("text/html; charset=utf-8");
		
		// 3. 데이터베이스 핸들링 담당 객체 생성
		MemberDAO dao = new MemberDAO();
		
		// 컨텍스트 패스
		String contextPath = request.getContextPath();
		
		// 4. 파라미터 수집
		String id = request.getParameter("id");
		
		// 5. 화면에서 받은 id로 사용자 조회
		MemberVO member = dao.getMember(id);
		
		// 6. 조회한 사용자 정보를 업데이트 폼에 보여주도록 실어 보냄
		request.setAttribute("member", member);
		
		// 7. 회원 정보 보기 화면으로 이동
		RequestDispatcher dispatcher = request.getRequestDispatcher("memberView.jsp");
		dispatcher.forward(request, response);
	}
}
