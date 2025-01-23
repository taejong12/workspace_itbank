package ex01_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	Connection con;
	
	public StudentDAO() {
		try {
			// OracleDriver 가 있는지 확인 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 오라클 서버 접속 링크
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "c##user01";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결 실패");
		}
	}
	
	public int insert(Student stu) {
		String sql = 
				"insert into student values(?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstmt =
				con.prepareStatement(sql);
			// pstmt.set데이터타입(물음표위치, 값);
			pstmt.setString(1, stu.getName());
			pstmt.setInt(2, stu.getKor());
			pstmt.setInt(3, stu.getEng());
			pstmt.setInt(4, stu.getMath());
			pstmt.setInt(5, stu.getTotal());
			pstmt.setDouble(6, stu.getAvg());
			
			// executeUpdate()
			// - insert, delete, update 사용시
			// - 반환값은 정수 : 업데이트된 숫자
			int result = pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Student> selectAll(){
		List<Student> studentList =
				new ArrayList<Student>();
		String sql = "select * from student";
		
		try {
			PreparedStatement pstmt =
				con.prepareStatement(sql);
			// ResultSet : SQL 에서 가져오는 값 저장 객체 
			ResultSet rs = pstmt.executeQuery();
			
			// ResultSet.next()
			//	 - 값이 있으면 true, 없으면 false
			while(rs.next()) {
				Student s = new Student();
				// ResultSet.get데이터타입(컬럼순서)
				// ResultSet.get데이터타입("컬럼이름");
				s.setName(rs.getString("name"));
				s.setKor(rs.getInt("kor"));
				s.setEng(rs.getInt(3));
				s.setMath(rs.getInt(4));
				s.setTotal();
				s.setAvg();
				studentList.add(s);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return studentList;
	}
	
	public int delete(String name) {
		// 코드 작성
		String sql = 
			"delete from student where name=?";
		try {
			PreparedStatement pstmt =
					con.prepareStatement(sql);
			pstmt.setString(1, name);
			
			int result = pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	
	public int update(String oldName, Student s) {
		// 코드 작성
		String sql = "update student set "
				+ " name=?, kor=?, eng=?, math=?, "
				+ " total=?, avg=? where name=?";
		try {
			PreparedStatement pstmt =
					con.prepareStatement(sql);
			pstmt.setString(1, s.getName());
			pstmt.setInt(2, s.getKor());
			pstmt.setInt(3, s.getEng());
			pstmt.setInt(4, s.getMath());
			pstmt.setInt(5, s.getTotal());
			pstmt.setDouble(6, s.getAvg());
			pstmt.setString(7, oldName);
			
			int result = pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
}








