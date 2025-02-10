package java8.Basic.OtherUpdates;

public class Runnable1 implements Runnable {
//write a java program to print number from 1 to 5 using Thread with the help of runnable interface.
	@Override
	public void run() {
		for(int i = 1;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		Thread th = new Thread(pn);
		th.start();
	}
}

