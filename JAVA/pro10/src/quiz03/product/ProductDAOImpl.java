package quiz03.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO{
	Connection con;

	public ProductDAOImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "c##user01";
			String pwd = "1234";
			con = DriverManager.getConnection(url,user,pwd);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("오라클 연결 실패");
		}
	}
	
	
	@Override
	public List<Product> proSelectAll() {
		
		List<Product> productList = new ArrayList<Product>();
		
		String sql = "select * from product";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Product p = new Product();
				p.setProId(rs.getInt(1));
				p.setProName(rs.getString(2));
				p.setProPrice(rs.getInt(3));
				p.setProStock(rs.getInt(4));
				productList.add(p);
			}
			return productList;
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("제품 리스트 조회 에러");
		}
		return null;
	}


	@Override
	public int proInsert(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int proUpdate(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int proDelete(String id, String name) {
		// TODO Auto-generated method stub
		return 0;
	}

 
}
