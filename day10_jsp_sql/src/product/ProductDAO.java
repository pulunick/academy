package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ProductDAO {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	private final String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private final String user = "c##itbank";
	private final String password = "it";
	
	public ProductDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("DAO 생성자 예외 발생 : " + e);
		} catch (ClassNotFoundException e) {
			System.out.println("지정한 클래스를 찾을 수 없습니다 : " + e);
		}
	}
	
	public ArrayList<ProductDTO> select() {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		String sql = "select * from product_1";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				ProductDTO ob = new ProductDTO();
				// 문자에 숫자를 넣어도 괜찮음(sql table의 number 순으로)
				ob.setIdx(rs.getInt("idx"));
				ob.setName(rs.getString("name"));
				ob.setPrice(rs.getInt("price"));
				ob.setImgPath(rs.getString("imgPath"));
				list.add(ob);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {}
		}
		return list;
	}
	
	public ArrayList<ProductDTO> selectListByName(String keyword) {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		String sql = "select * from product_1 where name like '%" + keyword + "%'";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				ProductDTO ob = new ProductDTO();
				// 문자에 숫자를 넣어도 괜찮음(sql table의 number 순으로)
				ob.setIdx(rs.getInt("idx"));
				ob.setName(rs.getString("name"));
				ob.setPrice(rs.getInt("price"));
				ob.setImgPath(rs.getString("imgPath"));
				list.add(ob);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {}
		}
		return list;
	}
	
	public ProductDTO selectOne(int idx) {
		ProductDTO ob = null;
		String sql = "select * from product_1 where idx = " + idx;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				ob = new ProductDTO();
				ob.setIdx(rs.getInt("idx"));
				ob.setName(rs.getString("name"));
				ob.setPrice(rs.getInt("price"));
				ob.setImgPath(rs.getString("imgPath"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {}
		}
		
		return ob;
	}
}


