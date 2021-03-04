package multithreading;
//class implementing Runnable Interface

/*
 * when we extend Thread class ,then we can not extend any other class
 * so when we implement runnable interface we can extend other classes also
 */

public class TextRunnable implements Runnable {
	public static void main(String[] args) {
		System.out.println("In mainMethod");
		TextRunnable obj = new TextRunnable();
		Thread t = new Thread(obj);
		t.start();
		System.out.println("getName :" + t.getName());
		System.out.println("getId :" + t.getId());
		System.out.println("getPriority :" + t.getPriority());
		System.out.println("getState :" + t.getState());
		System.out.println("getContextClassLoader :" + t.getContextClassLoader());
		t.setName("Koti");
		System.out.println(t.getName());

	}

	@Override
	public void run() {
		System.out.println("In runMethod");
	}

}
