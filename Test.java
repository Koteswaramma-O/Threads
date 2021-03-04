package multithreading;

public class Test extends Thread {

	public static void main(String[] args) {
		Thread T = new Thread();
		T.start();
		try {
			System.out.println("Entering into DeadLock");
			Thread.currentThread().join();
			System.out.println("This statement will never print");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		System.out.println("In runMethod");
	}
}
