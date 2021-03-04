package multithreading;

public class AllMethods extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		AllMethods obj = new AllMethods();
		AllMethods obj1 = new AllMethods();
		AllMethods obj2 = new AllMethods();

		obj.start();

		// Returns a reference to the currently executing thread object.
		System.out.println("currentThread :" + currentThread());

		// this thread's ID.
		System.out.println("getId :" + obj.getId());

		// Returns the runtime class of this Object.
		System.out.println("getClass :" + obj.getClass());

		// this thread's priority.
		System.out.println("getPriority :" + obj.getPriority());

		// Waits for this thread to die.
		obj.join();

		// true if this thread is alive; false otherwise.
		System.out.println("isAlive :" + obj.isAlive());

		// true if this thread is a daemon thread; false otherwise.
		System.out.println("isDaemon :" + obj.isDaemon());

		obj1.start();
		System.out.println("toString :" + obj1.toString());
		obj2.start();

	}

}
