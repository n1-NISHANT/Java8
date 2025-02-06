package Java8.Basic.OtherUpdates;

public class InstanceMethodRef{
   public void m1() {
		    for(int i = 0;i<=5;i++) {
            System.out.println(i);
		    }
	   }
	  public static void main(String[] args) {
  		InstanceMethodRef im = new InstanceMethodRef();
  		Runnable r = im::m1;
  		Thread t = new Thread(r);
		    t.start();
	  }
}
