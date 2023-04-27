package com.javalab.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 업데이트할 화면을 보여줄 서블릿
 */
@WebServlet("/updateForm")
public class UpdateFormServlet extends HttpServlet {
       
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
		
		// 컨텍스트 패스(필요시 사용)
		String contextPath = request.getContextPath();
		
		// 4. 파라미터 수집
		String id = request.getParameter("id");
		
		// 5. 화면에서 받은 id로 사용자 조회
		MemberVO member = dao.getMember(id);
		request.setAttribute("member", member);
		
		// 6. 조회한 사용자 정보를 수정화면으로 전달
		RequestDispatcher dispatcher = request.getRequestDispatcher("memberUpdateForm.jsp");
		dispatcher.forward(request, response);
	}
}