package multithreading;

public class ThreadClassMethods extends Thread {
	// using sleep()
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadClassMethods obj = new ThreadClassMethods();
		ThreadClassMethods obj1 = new ThreadClassMethods();

		// calling run() directly instead of start().
		obj.run();// fine, its working.But it does not start a separate call stack

		/*
		 * Q)can we call start() two times ? No, when we call Start() two times then it
		 * will throws one exception i.e: java.lang.IllegalThreadStateException
		 * 
		 */
		obj.start();
		obj1.start();
		// obj.start();

	}

}
