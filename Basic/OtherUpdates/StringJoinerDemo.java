package Java8.Basic.OtherUpdates;

import java.util.StringJoiner;
public class StringJoinerDemo{
public static void main(String[] args) {
	 StringJoiner sj = new StringJoiner("-");
	 sj.add("Nishant");
	 sj.add("Kumar"); 
	 System.out.println(sj);
	 
	 StringJoiner sj2 = new StringJoiner("-","(",")");
	 sj2.add("Nishant");
	 sj2.add("Kumar"); 
	 System.out.println(sj2);
 }
}
