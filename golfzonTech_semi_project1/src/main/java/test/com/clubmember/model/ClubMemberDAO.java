package test.com.clubmember.model;

import java.util.List;

import test.com.club.model.ClubVO;

public interface ClubMemberDAO {
	public int insert(ClubMemberVO vo);// 가입신청 메소드

	public int update(ClubMemberVO vo);// 가입승인 메소드

	public int update_cmtype(ClubMemberVO vo);// 운영자 권한부여,삭제

	public int delete(ClubMemberVO vo);// 모임 탈퇴(개인)

	public int kick(ClubMemberVO vo);// 모임원 강퇴(모임장)

	public List<ClubMemberVO> clubmembers(ClubVO vo);// 모임가입멤버 목록

	public List<ClubMemberVO> waiting(ClubVO vo);// 모임가입대기멤버 목록

	public String createQuery(String location, String gender, int age);

	// 모임설정 가입 조건 (지역,성별,나이)에 따라 조건비교하는 쿼리문 생성
	boolean isqualified(long club_id, String member_id, String query);// 가입조건 비교 후 가입가능여부 판단

	boolean isMember(ClubVO vo);// 현재 모임상세페이지 접속자의 아이디가 모임원인지 비교

	ClubMemberVO selectStatus(ClubMemberVO vo);
	// 가입신청여부 status상태 확인 메소드

}
