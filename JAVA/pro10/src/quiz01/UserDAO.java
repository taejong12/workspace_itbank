package quiz01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	Connection con;
	
	public UserDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "c##user01";
			String pass = "1234";
			
			con = DriverManager.getConnection(url,user,pass);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오라클 연결 실패");
		}
	}
	public int insert(User u) {
		// TODO Auto-generated method stub
		String sql = "insert into t_user "
				+ "values(?,?,?,?,sysdate)";
		try {
			PreparedStatement pstmt 
				= con.prepareStatement(sql);
			pstmt.setString(1, u.getId());
			pstmt.setString(2, u.getPwd());
			pstmt.setString(3, u.getName());
			pstmt.setString(4, u.getEmail());
			
			int result = pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	public int delete(String id, String pwd) {
		// TODO Auto-generated method stub
		String sql = "delete from t_user where "
				+ " id=? and pwd=?";
		try {
			PreparedStatement pstmt =
					con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			
			int result = pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	public List<User> find(String sub, String id) {
		// TODO Auto-generated method stub
		List<User> userList = new ArrayList<User>();
		String sql = "select * from t_user where ";
		if(sub.equals("아이디")) {
			sql += " id like '%'||?||'%' ";
		} else if(sub.equals("이름")) {
			sql += " name like '%'||?||'%' ";
		}
		
		try {
			PreparedStatement pstmt =
					con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				User u = new User();
				u.setId(rs.getString(1));
				u.setPwd(rs.getString(2));
				u.setName(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setJoinDate(rs.getDate(5));
				userList.add(u);
			}
			
			return userList;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public int update(User u) {
		// TODO Auto-generated method stub
		String sql = "update t_user set pwd=?, "
				+ " name=?, email=? where id=?";
		try {
			PreparedStatement pstmt = 
					con.prepareStatement(sql);
			pstmt.setString(1, u.getPwd());
			pstmt.setString(2, u.getName());
			pstmt.setString(3, u.getEmail());
			pstmt.setString(4, u.getId());
			
			int result = pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

}