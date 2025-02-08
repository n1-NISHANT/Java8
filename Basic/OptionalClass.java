package Java8.Basic;

import java.util.Optional;
import java.util.Scanner;
public class User {
	public Optional<String> getUsername(Integer id){
		String name =null;
		if(id == 100) {
			name = "Vikash";
		}else if(id == 101) {
			name = "Raju";
		}else if(id == 102) {
			name = "Jons";
		}
		return Optional.ofNullable(name);
	}
}
public class OptionalClassDemo {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter User ID ");
	int userId = s.nextInt();
	
	User u = new User();
	
	Optional<String> username = u.getUsername(userId);
	if(username.isPresent()) {
	String name = username.get();
	System.out.println(name.toUpperCase()+", Hello");
	}else {
	  System.out.println("No Data Found");
	}
    }
}

