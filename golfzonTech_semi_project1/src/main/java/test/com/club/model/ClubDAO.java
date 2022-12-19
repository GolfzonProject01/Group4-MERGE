package test.com.club.model;

import java.util.List;

import test.com.clubmember.model.ClubMemberVO;


public interface ClubDAO {
   
	   public int insert(ClubVO vo);//모임 개설
	   public int update(ClubVO vo);//모임  수정
	   public int delete(ClubVO vo);//모임 삭제
	   public ClubVO selectOne(ClubVO vo);//모임 선택해서 상세보기
	   public List<ClubVO> selectAll(String order);//모임 전체 리스트
	   public List<ClubVO> searchList(String query, String searchWord);//모임 검색
	   public int insertleader(ClubMemberVO vo);//모임 개설시 모임원DB(clubmember)테이블에 모임리더 입력하는 메소드
	   public ClubVO leaderinfo(ClubVO vo);//모임리더 정보 불러오는 메소드
	   public List<ClubVO> selectAllMyClub(ClubVO vo);//내가 가입한 모임리스트
	   public String createQuery_searchList(String location, String gender, int age, String searchKey);
	   //모임 검색(다중) 시 검색 조건에 맞는 쿼리문 만드는 메소드  
	   public List<ClubVO> selectAllByID();
}