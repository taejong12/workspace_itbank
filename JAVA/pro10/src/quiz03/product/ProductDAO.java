package quiz03.product;

import java.util.List;

public interface ProductDAO {

	public List<Product> proSelectAll();
	public int proInsert(Product p);
	public int proUpdate(Product p);
	public int proDelete(String id, String name);
	
}
