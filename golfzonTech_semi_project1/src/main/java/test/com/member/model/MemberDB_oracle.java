package test.com.member.model;

public interface MemberDB_oracle {
	String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	String USER = "GOLFMATE";
	String PASSWORD = "admin1234";

	// 회원가입 시 입력하는 정보를 member테이블에 입력
	String SQL_INSERT = "insert into member(member_id,pw,name,gender,birth,location,img_name) "
			+ "values(?,?,?,?,?,?,?)";
	// 회원수정
	String SQL_UPDATE = "update member set pw=?,location=?,img_name=? where member_id=?";
	// 회원 탈퇴
	String SQL_DELETE = "delete from member where member_id=?";
	// 회원정보 가져오기
	String SQL_SELECT_ONE = "select * from member where member_id=?";
	// 아이디 중복 체크 시 DB 저장된 아이디 가져오기
	String SQL_ID_CHECK = "select * from member where member_id=?";
	// 로그인 시 저장된 아이디,비번 가져오기
	String SQL_LOGIN = "select * from member where member_id=? and pw=?";
	// 회원가입 시 입력된 생년월일로 만 나이 계산하기
	String SQL_CAL_AGE = "update member set m_age=TRUNC(MONTHS_BETWEEN(sysdate, birth)/12) where member_id=?";
}
