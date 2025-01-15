package ex03_system;

import java.util.Properties;
import java.util.Set;

public class Exam03 {
	public static void main(String[] args) {
		System.out.println
			(System.getProperty("os.name"));
		System.out.println
			(System.getProperty("user.name"));
		System.out.println
			(System.getProperty("user.home"));
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object obj : keys) {
			String key = (String)obj;
			String value = System.getProperty(key);
			System.out.println(key + " : " + value);
		}
		
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
	}
}




