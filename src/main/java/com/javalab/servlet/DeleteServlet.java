package com.javalab.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalab.dao.MemberDAO;

/**
 * 회원 정보를 업데이트하는 서블릿
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	
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
		
		// 4. 파라미터 수집
		String id = request.getParameter("id");
		
		// 5. 삭제 메소드 호출
		dao.deleteMember(id);
		
		// 6. 현재 프로그램의 컨텍스트 패스 읽기
		String contextPath = request.getContextPath();
		
		// 7. 삭제 작업 후에 회원 조회 리스트로 이동(사용자로부터 새로운 요청)
		response.sendRedirect(contextPath + "/list"); 
	}
}