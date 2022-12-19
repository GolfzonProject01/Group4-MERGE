package test.com.clubmember.model;

public interface ClubMemberDB_oracle {
	String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	String USER = "GOLFMATE";
	String PASSWORD = "admin1234";
	// 모임 가입 신청시 가입신청자의 정보를 clubmember테이블에 가져오기
	String SQL_INSERT = "insert into clubmember(cm_id,club_id,member_id,qualified,status,cmdate,cmtype) "
			+ "values(seq_clubmember.nextval,?,?,1,0,sysdate,0)";
	// 모임 탈퇴시 clubmember테이블에서 삭제하기
	String SQL_DELETE = "delete from clubmember where cm_id=(select cm_id from clubmember where member_id=? and club_id=?)";
	// 모임원 리스트 출력하기
	String SQL_SELECT_ALL = "select club_id, club_leader,club_name,cdate,club_img from club order by club_id desc";
	// 모임가입 승인대기중인 대기자 리스트 출력
	String SQL_SELECT_ALL_WAIT = "select cm.cm_id, cm.cmtype, m.name, m.gender, m.m_age,cm.status from clubmember cm "
			+ "left outer join member m on cm.member_id = m.member_id where cm.club_id=? and cm.status=0";
	// 모임 가입된 모임원 리스트 불러오기
	String SQL_SELECT_ALL_CLUBMEMBERS = "select cm.cm_id, cm.cmtype, m.name, m.gender, m.m_age, cm.status from clubmember cm "
			+ "left outer join member m on cm.member_id = m.member_id where cm.club_id=? and cm.status=1 order by cm.cmtype desc";
	// 가입 승인 시 가입상태(status=0 가입승인대기/ status=1 승인)를 승인상태로 변경하기
	String SQL_ACCEPT = "update clubmember set status=1 where cm_id=?";
	// 모임원table의 cmtype(멤버등급)을 변경
	String SQL_GRANT_REVOKE = "update clubmember set cmtype=? where cm_id=?";
	// 모임원 강퇴 시 모임원테이블에서 cm_id 조회하여 삭제
	String SQL_KICK = "delete from clubmember where cm_id=?";
	// 모임원테이블에서 가입자정보 가져오기
	String SQL_SELECT_ONE = "select * from clubmember where cm_id=?";
//	String SQL_COMPARE = "select * from club, member where club_id=? and member_id=?";

}
