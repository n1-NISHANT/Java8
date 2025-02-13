package java8.Basic.Stream;
import java.util.stream.Stream;

public class StreamInput{
public static void main(String[] args) {
    Stream<Integer> stream =  Stream.of(10,20,30,40,50);
		//System.out.println(stream);

	ArrayList<String> al = new ArrayList<String>();
	    al.add("Sam");
	    al.add("Som");
	    al.add("Karan");
	    Stream<String> stream2 = al.stream();
	    //System.out.println(stream2);
  }
}
