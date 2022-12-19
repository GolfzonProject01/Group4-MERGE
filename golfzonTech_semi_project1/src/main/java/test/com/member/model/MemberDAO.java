package test.com.member.model;

public interface MemberDAO {

	public int insert(MemberVO vo);// 회원가입

	public int update(MemberVO vo);// 회원정보 수정

	public int delete(MemberVO vo);// 회원탈퇴

	public MemberVO selectOne(MemberVO vo);// 회원정보 보기

	public MemberVO idCheck(MemberVO vo);// 아이디 중복체크

	public MemberVO login(MemberVO vo);// 로그인

	public int insertage(MemberVO vo);// 회원가입 시 입력한 생년월일로 나이 계산
}
