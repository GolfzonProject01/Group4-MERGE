package test.com.club.model;

public interface ClubDB_oracle {
	String DRIVER_NAME = "oracle.jdbc.OracleDriver";
	String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	String USER = "GOLFMATE";
	String PASSWORD = "admin1234";
	// 모임 개설 시 모임table에 정보 삽입
	String SQL_INSERT = "insert into club(club_id,club_leader,club_name,club_desc,gender,age,"
			+ "location,cdate,close,club_img) values(?,?,?,?,?,?,?,sysdate,?,?)";
	// 모임 전체 리스트 조회시 개설일기준 최신 순 정렬
	String SQL_SELECT_ALL_new = "select c.club_id, c.club_leader, c.club_name, c.cdate, c.club_img, m.img_name "
			+ "from club c left outer join member m on c.club_leader = m.member_id where c.close=0 order by club_id desc";
	// 모임 전체 리스트 조회시 개설일기준 오래된 순 정렬
	String SQL_SELECT_ALL_old = "select c.club_id, c.club_leader, c.club_name, c.cdate, c.club_img, m.img_name "
			+ "from club c left outer join member m on c.club_leader = m.member_id where c.close=0 order by club_id asc";
	// 모임 정보 가져오기
	String SQL_SELECT_ONE = "select * from club where club_id=?";
	// 모임 정보 수정하기
	String SQL_UPDATE = "update club set club_name=?,club_desc=?,gender=?,age=?,location=?,close=?,club_img=? where club_id=?";
	// 모임 삭제하기
	String SQL_DELETE = "delete from club where club_id=?";
	// 모임개설자(리더)의 정보를 clubmember테이블에 삽입
	String SQL_INSERT_CLUBLEADER = "insert into clubmember(cm_id,club_id,member_id,qualified,status,cmdate,cmtype) "
			+ "values(seq_clubmember.nextval,?,?,1,1,sysdate,2)";
	// 모임ID(PK) 순번을 가져오기
	String SQL_CLUB_ID = "select seq_club.nextval from dual";
	// 해당 모임의 모임리더 정보 가져오기
	String SQL_LEADERINFO = "select m.name, m.gender, m.birth, m.location ,m.img_name, m.m_age, m.member_id "
			+ "from club c left outer join member m on c.club_leader = m.member_id where c.club_id=?";

	// 내가 가입한 모임목록
	String SQL_MY_CLUB_LIST = "select c.club_id, c.club_img, c.club_name, c.cdate from club c, clubmember cm, member m "
			+ "where cm.status=1 and cm.member_id = m.member_id and c.club_id = cm.club_id and m.member_id = ?";
	// 접속자가 해당 모임의 리더인지 여부 확인하기 위해 모임원table에서 정보 가져오기
	String SQL_IS_CLUB_LEADER = "select * from clubmember where club_id=? and member_id= ?";
	// club_id와 member_id로 일치하는 모임원 cm_id 가져오기
	String SQL_CM_ID = "select cm_id from clubmember where club_id=? and member_id=?";
	// club_id와 member_id로 일치하는 모임원 정보 가져오기
	String SQL_IS_MEMBER = "select * from clubmember where club_id=? and member_id= ?";

	String SQL_SELECT_ALL_BY_CDATE = "select club_id, club_name, club_leader, club_img, cdate, img_name from club c left outer join member m on c.club_leader = m.member_id where close = 0 and cdate between (SYSDATE - (INTERVAL '7' DAY)) and sysdate order by cdate desc";
	String SQL_SELECT_STATUS = "select * from clubmember where club_id=? and member_id= ?";
}