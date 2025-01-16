package Java8.Basic.Lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class OddEven{
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  Predicate<Integer> e = (a)-> a%2==0;
	 // System.out.println("given number is even --> "+e.test(10));
	  System.out.println("given number is even --> "+e.test(sc.nextInt()));
}
}

