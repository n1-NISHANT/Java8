package Java8.Basic.OtherUpdates;

public class Runnable3{
public static void main(String[] args) {
	Runnable rn  = ()->{
	    	 for(int i=1;i<=5;i++) {
	    		 System.out.println(i);
	    	 }
	     };
	     Thread th = new Thread(rn);
	     th.start();
   }
}
