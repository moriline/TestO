package moriline.testo;

import java.util.Collection;

/**
 * Testing for repeating test in Runnable interface by count.
 * <pre>
 * new RepeatOf(4, new Runnable() {
			public void run() {
				System.out.println("start:"+Thread.currentThread().getName());
				new TArray<String>("a","b").eq("a","b");
			}
		}).start();
 * </pre>
 * @author Moriline
 *
 */
public final class RepeatOf implements Assertive{

	private final int count;
	//original value
	private final Runnable[] tests;
	
	/**
	 * Constructor.
	 * @param count
	 * @param tests
	 */
	public RepeatOf(int count, Collection<Runnable> tests) {
		this(count, tests.toArray(new Runnable[tests.size()]));
	}
	
	/**
	 * Constructor.
	 * @param count
	 * @param testables
	 */
	public RepeatOf(int count, Runnable ...testables){
		this.count = count;
		this.tests = testables;
	}

	/**
	 * Method for running array of Runnable.
	 */
	public void start() {
		for (int i = 0; i < this.count; i++) {
			for (Runnable test : this.tests) {
				new Thread(test, "test "+i).start();
			}
		}
	}
	
	/**
	 * Get original value.
	 * @return tests Runnable[]
	 */
	public Runnable[] get() {
		return this.tests;
	}

	public static void main(String[] args) {
		
	}
}
