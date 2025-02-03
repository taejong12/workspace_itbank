package main.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import main.member.dto.Member;

public class LoginDAO {
	Connection con;
	
	public LoginDAO() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName
			("oracle.jdbc.driver.OracleDriver");
			String url = 
				"jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "c##user01";
			String pass = "1234";
			
			con = DriverManager.
					getConnection(url,user,pass);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public boolean loginChk
			(String id, String pwd) {
		// TODO Auto-generated method stub
		String sql = "select "
				+ " decode(count(*), 1, 'true', 'false') "
				+ " from member where id=? and pwd=?";
		boolean result = false;
		try {
			PreparedStatement pstmt =
					con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			
			ResultSet rs = pstmt.executeQuery();
			
			
			if (rs.next()) {
				result = Boolean.
					parseBoolean(rs.getString(1));
			}
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

	public List<Member> selectAll() {
		// TODO Auto-generated method stub
		String sql = "select * from member";
		List<Member> memberList = 
				new ArrayList<Member>();
		try {
			PreparedStatement pstmt =
					con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Member m = new Member();
				m.setId(rs.getString(1));
				m.setPwd(rs.getString(2));
				m.setName(rs.getString(3));
				m.setGender(rs.getString(4));
				m.setAge(rs.getInt(5));
				m.setHobby(rs.getInt(6));
				memberList.add(m);
			}
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return memberList;
	}
}






