package Java8.Basic.Lambda;

import java.util.function.Predicate;

public class FindName {
	public static void main(String[] args) {
		
		String [] arr = {"Sonu","Sandeep","Amit","nishant","abhisheak","santosh","Ajeet"};
			  Predicate<String> p = (s1)->s1.toUpperCase().charAt(0)=='S';
		  for(String s : arr) 
		  { 
			  if(p.test(s)==true)
			  System.out.println(s); 
		  }
  }
}
