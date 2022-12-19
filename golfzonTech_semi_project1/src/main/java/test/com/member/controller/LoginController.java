package test.com.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.com.member.model.MemberDAO;
import test.com.member.model.MemberDAOimpl;
import test.com.member.model.MemberVO;

/**
 * 1. 작성자: 최수연 (백엔드) 
 * 2. 기능: 회원 로그인
 */
@WebServlet({ "/login.do", "/logout.do", "/loginOK.do" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sPath = request.getServletPath();
		System.out.println("doGet:" + sPath);

		if (sPath.equals("/login.do")) {
			request.getRequestDispatcher("HTML/login.jsp").forward(request, response);
		} else {
			HttpSession session = request.getSession();
			session.removeAttribute("member_id");
			response.sendRedirect("home.do");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String sPath = request.getServletPath();
		System.out.println("doPost:" + sPath);
		if (sPath.equals("/loginOK.do")) {
			System.out.println(request.getParameter("member_id"));
			System.out.println(request.getParameter("pw"));

			MemberDAO dao = new MemberDAOimpl();
			MemberVO vo = new MemberVO();
			vo.setMember_id(request.getParameter("member_id"));
			vo.setPw(request.getParameter("pw"));

			MemberVO vo2 = dao.login(vo);
			System.out.println("login:" + vo2);

			if (vo2 != null) {
				HttpSession session = request.getSession();
				session.setAttribute("member_id", vo2.getMember_id());
				response.sendRedirect("home.do");
			} else {
				response.sendRedirect("login.do");
			}

		}
	}

}
