package Java8.Basic;

import java.util.Optional;

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
}

