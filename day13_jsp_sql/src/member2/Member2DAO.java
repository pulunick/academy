package member2;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Member2DAO {
	// 싱글톤과 Connectionpool이 적용된 member2 테이블 관련 DAO를 작성하세요
	
	// 회원 목록을 반환하는 함수를 작성하여 jsp에서 출력합니다
	
	// header.jsp 를 작성하여 tablib, import, dao 선언을 수행합니다
	
	// list.jsp를 작성하여 회원 목록을 table 형식으로 화면에 출력합니다.

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Context init;
	private DataSource ds;	// 여러개의 conn을 가지고 있다가 하나씩 내어주고,
							// conn.close()하면 객체를 돌려받아서, 다시 사용할 수 있도록 처리한다
							// 컨베이어 벨트 방식으로 conn 객체를 재활용한다
	
	private static Member2DAO instance = new Member2DAO();
	
	public static Member2DAO getInstance() {
		return instance;
	}
	
	public Member2DAO() {
		try {
			init = (Context) new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) try { conn.close(); } catch (SQLException e) {}
		}
	}// end of constructor
	
	// select 하는 경우, rs의 데이터를 DTO에 맞게 맵핑하는 과정이 필요하다
	// 전체, 검색, 단일 조회 모든 경우에 사용할 수 있도록 함수를 만들어 둔다
	private Member2DTO mapping(ResultSet rs) throws SQLException{//함수에서 try catch를 열기때문에 전가 시켜도 됨
		Member2DTO dto = new Member2DTO();
		dto.setIdx(rs.getInt("idx"));
		dto.setUserid(rs.getString("userid"));
		dto.setUserpw(rs.getString("userpw"));
		dto.setUsername(rs.getString("username"));
		dto.setGender(rs.getString("gender"));
		return dto;
	}
	
	// 모든 함수에서 rs, pstmt, conn을 순서대로 닫아준다 (열기의 역순으로 닫는다)_
	private void close() {
		try {
			if(rs != null) 		rs.close();
			if(pstmt != null) 	pstmt.close();
			if(conn != null) 	conn.close();
			// dataSource에서 가져온 conn은 close()하면 회수된다
		} catch(Exception e) {}
	}
	
	public ArrayList<Member2DTO> selectList() {
		ArrayList<Member2DTO> list = new ArrayList<Member2DTO>();
		String sql = "select * from member3 order by idx";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Member2DTO dto = mapping(rs);
				list.add(dto);
//				list.add(mapping(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close(); }
		return list;
	}
	
	public Member2DTO selectOne(int idx) {
		String sql = "select * from member3 where idx=" + idx;
		Member2DTO dto = null;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				dto = mapping(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close();}
		return dto;
	}
	
	public int insert(Member2DTO dto) {
		int row = 0;
		String sql = "insert into member3 (userid, userpw, username, gender) values(?, ?, ?, ?)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, dto.getUserpw());
			pstmt.setString(3, dto.getUsername());
			pstmt.setString(4, dto.getGender());
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close();}
		return row;
	}
	
	public int update(Member2DTO dto) {
		int row = 0;
		String sql = "update member3 set userid=?, userpw=?, username=?, gender=? where idx=?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, dto.getUserpw());
			pstmt.setString(3, dto.getUsername());
			pstmt.setString(4, dto.getGender());
			pstmt.setInt(5, dto.getIdx());
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { close();}
		
		return row;
	}
	
	public int delete(int idx) {
		int row = 0;
		String sql = "delete from member3 where idx=" + idx;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);	
			row = pstmt.executeUpdate();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return row;
	}
	
}
