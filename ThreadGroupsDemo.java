package multithreading;

public class ThreadGroupsDemo implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Parent Thread Group");
		ThreadGroupsDemo runnable = new ThreadGroupsDemo();
		Thread t1 = new Thread(tg, runnable, "one");
		t1.start();
		Thread t2 = new Thread(tg, runnable, "two");
		t2.start();
		Thread t3 = new Thread(tg, runnable, "three");
		t3.start();
		System.out.println("getThreadGroup :" + t3.getThreadGroup());
		System.out.println("getName :" + tg.getName());
		System.out.println("getParent :" + tg.getParent());
		System.out.println("activeGroupCount :" + tg.activeGroupCount());
		tg.list();

	}

}
