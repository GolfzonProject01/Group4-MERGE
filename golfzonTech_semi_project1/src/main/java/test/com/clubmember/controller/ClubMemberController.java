package test.com.clubmember.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.com.clubmember.model.ClubMemberDAO;
import test.com.clubmember.model.ClubMemberDAOimpl;
import test.com.clubmember.model.ClubMemberVO;

/**
 * 1. 작성자: 최수연 (백엔드) 
 * 2. 기능: 모임원 데이터의 CRUD, 운영자 권한 부여, 삭제
 */
@WebServlet({ "/club_join_apply.do", "/club_join_applyOK.do", "/club_join_accept.do", "/club_join_acceptOK.do",
		"/cm_leave.do", "/cm_leaveOK.do", "/cm_kick.do", "/cm_kickOK.do", "/cm_grant.do", "/cm_grantOK.do",
		"/cm_revoke.do", "/cm_revokeOK.do" })
public class ClubMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ClubMemberDAO dao = new ClubMemberDAOimpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClubMemberController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sPath = request.getServletPath();
		System.out.println("doGet:" + sPath);
		if (sPath.equals("/club_join_apply.do")) {
			// 모임 가입을 신청합니다
			HttpSession session = request.getSession();
			String member_id = (String) session.getAttribute("member_id");
			System.out.println("member_id:" + member_id);

			if (member_id != null) {
				request.getRequestDispatcher("CLUBMEMBER/club_join.jsp").forward(request, response);
			} else {
				response.sendRedirect("login.do");
			}
		} else if (sPath.equals("/cm_leave.do")) {
			// 모임을 탈퇴합니다
			request.getRequestDispatcher("CLUBMEMBER/delete.jsp").forward(request, response);
		} else if (sPath.equals("/cm_leaveOK.do")) {
			// 모임 탈퇴확인
			String member_id = request.getParameter("member_id");
			long club_id = Long.parseLong(request.getParameter("club_id"));
			System.out.println(club_id);
			System.out.println(member_id);

			ClubMemberVO vo = new ClubMemberVO();
			vo.setClub_id(club_id);
			// 로그인 세션을 가져옵니다
			HttpSession session = request.getSession();
			member_id = (String) session.getAttribute("member_id");
			System.out.println("member_id:" + member_id);
			vo.setMember_id(member_id);

			int result = dao.delete(vo);// 모임을 탈퇴합니다
			System.out.println(result);
			if (result == 1)
				response.sendRedirect("club_selectAll.do");
			else
				response.sendRedirect("club_selectOne.do?club_id=" + club_id);
		} else if (sPath.equals("/club_join_accept.do")) {// 가입 승인
			request.getRequestDispatcher("CLUBMEMBER/join_accept.jsp").forward(request, response);
		} else if (sPath.equals("/cm_grant.do")) {// 운영자 권한 부여
			request.getRequestDispatcher("CLUBMEMBER/grant.jsp").forward(request, response);
		} else if (sPath.equals("/cm_revoke.do")) {// 운영자 권한 삭제
			request.getRequestDispatcher("CLUBMEMBER/revoke.jsp").forward(request, response);
		} else if (sPath.equals("/cm_kick.do")) {// 모임원 강퇴
			request.getRequestDispatcher("CLUBMEMBER/kick.jsp").forward(request, response);
		}
	}// end doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String sPath = request.getServletPath();
		System.out.println("doPost:" + sPath);

		if (sPath.equals("/club_join_applyOK.do")) {
			// 모임가입을 신청합니다
			long club_id = Long.parseLong(request.getParameter("club_id"));
			String member_id = request.getParameter("member_id");
			System.out.println(request.getParameter("club_id:" + club_id));
			System.out.println(request.getParameter("member_id:" + member_id));

			ClubMemberVO vo = new ClubMemberVO();

			vo.setClub_id(club_id);
			HttpSession session = request.getSession();
			member_id = (String) session.getAttribute("member_id");
			vo.setMember_id(member_id);

			int result = dao.insert(vo);// 모임가입신청자의 정보를 status=0(가입미승인)인 상태로 clubmember테이블에 입력합니다

			System.out.println("result:" + result);

			if (result == 1)
				response.sendRedirect("club_selectOne.do?club_id=" + club_id);
			else
				response.sendRedirect("club_join_apply.do");

		} // end joinOK
		else if (sPath.equals("/club_join_acceptOK.do")) {
			// 모임 가입 승인
			long cm_id = Long.parseLong(request.getParameter("cm_id"));
			System.out.println(cm_id);
			long club_id = Long.parseLong(request.getParameter("club_id"));
			System.out.println(club_id);

			ClubMemberVO vo = new ClubMemberVO();
			vo.setClub_id(club_id);
			vo.setCm_id(cm_id);

			int result = dao.update(vo);// 모임리더가 모임신청자의 가입상태를 1로 업데이트하여 가입을 승인합니다
			System.out.println(result);

			response.sendRedirect("club_selectOne.do?club_id=" + club_id);

		} else if (sPath.equals("/cm_grantOK.do")) {
			// 운영자 권한 부여
			long cm_id = Long.parseLong(request.getParameter("cm_id"));
			System.out.println(cm_id);
			long club_id = Long.parseLong(request.getParameter("club_id"));
			System.out.println(club_id);

			ClubMemberVO vo = new ClubMemberVO();
			vo.setClub_id(club_id);
			vo.setCm_id(cm_id);
			vo.setCmtype(1);// clubmember 테이블에 저장된 모임원의 cmtype(멤버등급)을 1(운영자)로 승급합니다

			int result = dao.update_cmtype(vo);// 멤버등급을 업데이트합니다
			System.out.println(result);

			response.sendRedirect("club_selectOne.do?club_id=" + club_id);
		} else if (sPath.equals("/cm_revokeOK.do")) {
			// 운영자 권한 삭제(강등)
			long cm_id = Long.parseLong(request.getParameter("cm_id"));
			System.out.println(cm_id);
			long club_id = Long.parseLong(request.getParameter("club_id"));
			System.out.println(club_id);

			ClubMemberVO vo = new ClubMemberVO();
			vo.setClub_id(club_id);
			vo.setCm_id(cm_id);
			vo.setCmtype(0);// clubmember 테이블에 저장된 모임원의 cmtype(멤버등급)을 0(일반회원)으로 강등합니다

			int result = dao.update_cmtype(vo);// 멤버등급을 업데이트합니다
			System.out.println(result);

			response.sendRedirect("club_selectOne.do?club_id=" + club_id);
		} else if (sPath.equals("/cm_kickOK.do")) {
			// 모임원 강퇴
			long cm_id = Long.parseLong(request.getParameter("cm_id"));
			System.out.println(cm_id);
			long club_id = Long.parseLong(request.getParameter("club_id"));
			System.out.println(club_id);

			ClubMemberVO vo = new ClubMemberVO();
			vo.setClub_id(club_id);
			vo.setCm_id(cm_id);

			int result = dao.kick(vo);// 모임원을 강퇴하고 clubmember테이블에서 삭제합니다
			System.out.println(result);

			response.sendRedirect("club_selectOne.do?club_id=" + club_id);// 강퇴 후 모임상세페이지로 이동합니다
		}
	}

}
