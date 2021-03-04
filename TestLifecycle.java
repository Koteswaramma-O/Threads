package multithreading;

public class TestLifecycle implements Runnable {
	public static Thread td1;
	public static TestLifecycle test;

	public static void main(String[] args) throws InterruptedException {
		test = new TestLifecycle();
		td1 = new Thread(test);
		// before calling Start().
		
		System.out.println("getState :" + td1.getState());
		td1.start();
		
		// After calling Start()
		System.out.println("getState :" + td1.getState());
		td1.getState();
		//waiting to Thread to Die
		td1.join();
		System.out.println("getState :" + td1.getState());

		// creating one more Thread
		TestLifecycle t = new TestLifecycle();
		Thread td2 = new Thread(t);
		td2.start();
		

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

}
