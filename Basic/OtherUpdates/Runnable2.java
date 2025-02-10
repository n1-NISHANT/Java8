package Java8.Basic.OtherUpdates;

public class Runnable2{
public static void main(String[] args) {
		Runnable rn = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =1;i<=5;i++) {
					System.out.println(i);
				}
			}
		};
		Thread th = new Thread(rn);
		th.start();
}
}
