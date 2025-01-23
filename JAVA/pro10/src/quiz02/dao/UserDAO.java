package quiz02.dao;

import java.util.List;
import quiz02.dto.User;

public interface UserDAO {
	public int insert(User u);
	public int delete(String id, String pwd);
	public List<User> find(String sub, String id);
	public int update(User u);
}