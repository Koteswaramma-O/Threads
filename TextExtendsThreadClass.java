package multithreading;

/* Thread Life Cycle
 *  New 
 *  Runnable
 *  Running
 *  Non-Runnable
 *  terminated
 * 
 * 
 * Here ways to create a Thread  Class
 * 1.By extending Thread Class
 * 2.by Implementing Runnable Interface
 * 
 * Extends Thread class Vs Implements  Runnable Interface
 *   Extending the Thread class will make your class unable to extend other classes, 
 *   because of the single inheritance feature in  JAVA.
 *   However, this will give you a simpler code structure. 
 *   If you implement Runnable, you can gain better object-oriented design and consistency and also avoid the single inheritance problems.
 *   
 *   If you just want to achieve basic functionality of a thread you can simply implement Runnable interface and override run() method. 
 *   But if you want to do something serious with thread object as it has other methods like suspend(), resume(), ..etc which are not available in Runnable interface then you may prefer to extend the Thread class.
 * 
 * 
 * 
 */
//here class extending Thread class.
public class TextExtendsThreadClass extends Thread {
	public void run() {
		System.out.println("in run Method");
	}

	public static void main(String[] args) {
		TextExtendsThreadClass obj = new TextExtendsThreadClass();
		// calling run().
		obj.start();
		System.out.println("In mainMethod");

	}

}
