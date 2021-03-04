package multithreading;

public class ThreadsJoin {

	public static void main(String[] args) {
		Thread td1 = new Thread(new Myclass(), "td1");
		Thread td2 = new Thread(new Myclass(), "td2");
		Thread td3 = new Thread(new Myclass(), "td3");
		td1.start();
		try {
			td1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		td2.start();
		try {
			td2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		td3.start();
		System.out.println("getStackTrace :" + td3.getStackTrace());
		System.out.println("getAllStackTraces :" + td3.getAllStackTraces());
		System.out.println("getUncaughtExceptionHandler :" + td3.getUncaughtExceptionHandler());
		

	}

}

class Myclass implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread Started :" + t.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread Ended :" + t.getName());

	}

}