package Java8.Basic.Lambda;

import java.util.function.Predicate;

public class OddEven{
 public static void main(String[] args) {
  Predicate<Integer> e = (a)-> a%2==0;
		 System.out.println("given number is even --> "+e.test(10));
}
}

