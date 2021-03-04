package multithreading;

import java.util.Map;

public class ThreadExamples extends Thread {
	public void run() {
		System.out.println("Run Method");
	}

	public static void main(String[] args) {
		ThreadExamples obj = new ThreadExamples();
		ThreadExamples obj1 = new ThreadExamples();
		ThreadExamples obj2 = new ThreadExamples();
		Map m = ThreadExamples.getAllStackTraces();
		
		System.out.println(m);
		// Tests if this thread is a daemon thread.

		System.out.println(obj.isDaemon());

		// if true, marks this thread as a daemon thread
		obj.setDaemon(true);

		System.out.println(obj.isDaemon());

		obj.start();

		// Interrupts this thread.
		obj.interrupt();
		obj1.start();
		obj2.start();

		// true if this thread has been interrupted; false otherwise.
		System.out.println("isInterrupted :" + obj.isInterrupted());

		// Returns count of active threads
		System.out.println(activeCount());

		// this thread's state.
		System.out.println(obj.getState());

		// the currently running thread has permission to modify this thread.
		obj.checkAccess();
		obj.setName("Koti");
		System.out.println("has access :" + obj.getName());

	}

}
