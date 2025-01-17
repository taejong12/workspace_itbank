package ex05_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Exam04 {
	public static void main(String[] args) 
		throws Exception {
		List<User> userList =
				new ArrayList<User>();
		File dir = new File("C:\\Users\\dbxow\\git\\workspace_itbank\\JAVA\\pro09\\src\\ex05_text");
		File file = new File(dir, "bbb.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			String[] u = str.split(",");
			User user = new User(u[0], 
					Integer.parseInt(u[1]));
			userList.add(user);
			
		}
		
		for(User u : userList) {
			System.out.println(u.get());
		}
		
		br.close();
		fr.close();
	}
}






