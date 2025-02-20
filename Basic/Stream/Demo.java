package Java8.Basic.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Demo{
public static void main(String[] args) {	
     Stream<Integer> stream =  Stream.of(10,20,30,40,50);
     //System.out.println(stream);	
	ArrayList<String> al = new ArrayList<String>();
	al.add("Sam");
	al.add("Som");
	al.add("Karan");
	Stream<String> stream2 = al.stream();
	//System.out.println(stream2);	
	List<Integer> li  = Arrays.asList(10,60,20,30,80);
	// first way or earlier way 
	/*	for(int a : li) {
		if(a>20)
	        	System.out.println(a);
		}
	*/
		// first way
	/*	Stream<Integer> str = li.stream();
		Stream<Integer> filter =  str.filter(a -> a>20);
		filter.forEach(i->System.out.println(i));
	*/
	//second way	
	//li.stream().filter(a->a>20).forEach(i->System.out.print(i+"\t "));
	
	List<String> l = Arrays.asList("Jons","Anikate","nishant","Ajay","mohan","Akash");
	l.stream().filter(a->a.startsWith("A")).forEach(i->System.out.println(i));		
	}
}
