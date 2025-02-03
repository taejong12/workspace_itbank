package main.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import main.common.service.CommonService;
import main.member.dto.Member;

public class MemberDAO {
	Connection con;
	
	public MemberDAO() {
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
	public boolean insertMember(Member m) {
		// TODO Auto-generated method stub
		CommonService cs = new CommonService();
		if(chkId(m.getId())) {
			String sql = "insert into member values("
					+ "?,?,?,?,?,?)";
			
			try {
				PreparedStatement pstmt = 
					con.prepareStatement(sql);
				pstmt.setString(1, m.getId());
				pstmt.setString(2, m.getPwd());
				pstmt.setString(3, m.getName());
				pstmt.setString(4, m.getGender());
				pstmt.setInt(5, m.getAge());
				pstmt.setInt(6, m.getHobby());
				int result = pstmt.executeUpdate();
				
				pstmt.close();
				if(result >= 1) {
					cs.msgBox("회원가입","회원가입여부",
						"회원가입에 성공하셨습니다.");
					return true;
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} else {
			cs.msgBox("아이디", "아이디 중복", 
				"같은 아이디가 존재합니다. 다시 입력하세요.");
		}
		return false;
	}
	
	private boolean chkId(String id) {
		// TODO Auto-generated method stub
		String sql = "select decode(count(*),"
				+ " 1,'false','true') "
				+ " from member where id=?";
		boolean result = false;
		try {
			PreparedStatement pstmt =
					con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = Boolean.
					parseBoolean(rs.getString(1));
			}
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

}