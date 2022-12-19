package test.com.clubmember.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.com.club.model.ClubDB_oracle;
import test.com.club.model.ClubVO;

public class ClubMemberDAOimpl implements ClubMemberDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public ClubMemberDAOimpl() {
		System.out.println("ClubMemberDAOimpl()");
		Connection conn = null;
		PreparedStatement pstmt = null;

		ResultSet rs = null;

		try {
			Class.forName(ClubMemberDB_oracle.DRIVER_NAME);
			System.out.println("Driver successed...");

//			jdbcConnectionTest();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void jdbcConnectionTest() {
		try {
			conn = DriverManager.getConnection(ClubMemberDB_oracle.URL, ClubMemberDB_oracle.USER,
					ClubMemberDB_oracle.PASSWORD);
			System.out.println("conn successed...");
			String sql = "SELECT VERSION() AS VERSION";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("version"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally
	}

	@Override
	public int insert(ClubMemberVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);

		int flag = 0;

		try {

			conn = DriverManager.getConnection(ClubMemberDB_oracle.URL, ClubMemberDB_oracle.USER,
					ClubMemberDB_oracle.PASSWORD);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(ClubMemberDB_oracle.SQL_INSERT);

			pstmt.setLong(1, vo.getClub_id());
			pstmt.setString(2, vo.getMember_id());

			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally
		return flag;
	}

	@Override
	public int update(ClubMemberVO vo) {
		System.out.println("update()...");
		System.out.println(vo);

		int flag = 0;

		try {
			conn = DriverManager.getConnection(ClubMemberDB_oracle.URL, ClubMemberDB_oracle.USER,
					ClubMemberDB_oracle.PASSWORD);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(ClubMemberDB_oracle.SQL_ACCEPT);

			pstmt.setLong(1, vo.getCm_id());

			flag = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally

		return flag;
	}

	@Override
	public int update_cmtype(ClubMemberVO vo) {
		System.out.println("update()...");
		System.out.println(vo);

		int flag = 0;

		try {
			conn = DriverManager.getConnection(ClubMemberDB_oracle.URL, ClubMemberDB_oracle.USER,
					ClubMemberDB_oracle.PASSWORD);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(ClubMemberDB_oracle.SQL_GRANT_REVOKE);

			pstmt.setInt(1, vo.getCmtype());
			pstmt.setLong(2, vo.getCm_id());

			flag = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally

		return flag;
	}

	@Override
	public int delete(ClubMemberVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);

		int flag = 0;

		try {
			conn = DriverManager.getConnection(ClubMemberDB_oracle.URL, ClubMemberDB_oracle.USER,
					ClubMemberDB_oracle.PASSWORD);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(ClubMemberDB_oracle.SQL_DELETE);

			pstmt.setString(1, vo.getMember_id());
			pstmt.setLong(2, vo.getClub_id());
			flag = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally

		return flag;
	}

	public List<ClubMemberVO> clubmembers(ClubVO vo) {
		System.out.println("clubmembers()...");

		List<ClubMemberVO> vos = new ArrayList<ClubMemberVO>();

		try {
			conn = DriverManager.getConnection(ClubMemberDB_oracle.URL, ClubMemberDB_oracle.USER,
					ClubMemberDB_oracle.PASSWORD);

			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(ClubMemberDB_oracle.SQL_SELECT_ALL_CLUBMEMBERS);
			pstmt.setLong(1, vo.getClub_id());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				ClubMemberVO vo2 = new ClubMemberVO();

				vo2.setCm_id(rs.getLong("cm_id"));
				vo2.setCmtype(rs.getInt("cmtype"));
				vo2.setName(rs.getString("name"));
				vo2.setM_gender(rs.getString("gender"));
				vo2.setM_age(rs.getInt("m_age"));
				vo2.setStatus(rs.getInt("status"));

				vos.add(vo2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally
		return vos;
	}

	@Override
	public List<ClubMemberVO> waiting(ClubVO vo) {
		System.out.println("waiting cm()...");

		List<ClubMemberVO> vos = new ArrayList<ClubMemberVO>();

		try {
			conn = DriverManager.getConnection(ClubMemberDB_oracle.URL, ClubMemberDB_oracle.USER,
					ClubMemberDB_oracle.PASSWORD);

			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(ClubMemberDB_oracle.SQL_SELECT_ALL_WAIT);
			pstmt.setLong(1, vo.getClub_id());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				ClubMemberVO vo3 = new ClubMemberVO();

				vo3.setCm_id(rs.getLong("cm_id"));
				vo3.setCmtype(rs.getInt("cmtype"));
				vo3.setName(rs.getString("name"));
				vo3.setM_gender(rs.getString("gender"));
				vo3.setM_age(rs.getInt("m_age"));
				vo3.setStatus(rs.getInt("status"));

				vos.add(vo3);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally
		return vos;
	}

	@Override
	public int kick(ClubMemberVO vo) {
		System.out.println("kick()...");
		System.out.println(vo);

		int flag = 0;

		try {
			conn = DriverManager.getConnection(ClubMemberDB_oracle.URL, ClubMemberDB_oracle.USER,
					ClubMemberDB_oracle.PASSWORD);
			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(ClubMemberDB_oracle.SQL_KICK);

			pstmt.setLong(1, vo.getCm_id());

			flag = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally

		return flag;
	}

	@Override
	public String createQuery(String location, String gender, int age) {

		StringBuilder sb = new StringBuilder("SELECT member.* FROM club, member where club_id=? ");

		if (!gender.equals("무관")) {
			sb.append("and club.gender = member.gender ");
		}
		if (!location.equals("무관")) {
			sb.append("and club.location = member.location ");
		}
		if (age != 0) {
			sb.append("and club.age = (case when m_age >= 60 then 60 else round(member.m_age/10)*10 end)");
		}
		sb.append("and member.member_id = ?");
		return sb.toString();
	}

	@Override
	public boolean isqualified(long club_id, String member_id, String query) {
		System.out.println("isqualified()....");
		boolean result = false;
		System.out.println(club_id);
		System.out.println(member_id);
		try {
			conn = DriverManager.getConnection(ClubMemberDB_oracle.URL, ClubMemberDB_oracle.USER,
					ClubMemberDB_oracle.PASSWORD);
			System.out.println("conn Successed...");

			pstmt = conn.prepareStatement(query);
			pstmt.setLong(1, club_id);
			pstmt.setString(2, member_id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	@Override
	public boolean isMember(ClubVO vo) {
		System.out.println("isMember()....");
		boolean flag = false;

		try {
			conn = DriverManager.getConnection(ClubDB_oracle.URL, ClubDB_oracle.USER, ClubDB_oracle.PASSWORD);
			System.out.println("conn Successed...");
			pstmt = conn.prepareStatement(ClubDB_oracle.SQL_IS_MEMBER);
			pstmt.setLong(1, vo.getClub_id());
			pstmt.setString(2, vo.getMember_id());

			System.out.println(vo.getClub_id());
			System.out.println(vo.getMember_id());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return flag;
	}

	@Override
	public ClubMemberVO selectStatus(ClubMemberVO vo) {
		System.out.println("selectOne()...");

		try {
			conn = DriverManager.getConnection(ClubDB_oracle.URL, ClubDB_oracle.USER, ClubDB_oracle.PASSWORD);

			System.out.println("conn successed...");

			pstmt = conn.prepareStatement(ClubDB_oracle.SQL_SELECT_STATUS);
			pstmt.setLong(1, vo.getClub_id());
			pstmt.setString(2, vo.getMember_id());

			rs = pstmt.executeQuery();

			while (rs.next()) {

				vo.setStatus(rs.getInt("status"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} // end finally
		return vo;
	}

}
