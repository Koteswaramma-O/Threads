package multithreading;

public class infinite extends Thread {

	public static void main(String[] args) {
		infinite obj = new infinite();
		Thread td = new Thread(obj);
		td.start();
		System.out.println("Main");

	}

	public void run() {
		infinite obj1 = new infinite();
		Thread td2 = new Thread(obj1);
		td2.start();
		System.out.println("Run");

	}

}
