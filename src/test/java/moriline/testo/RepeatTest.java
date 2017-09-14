package moriline.testo;

public class RepeatTest {

	public static void main(String[] args) {
		new RepeatOf(4, new Runnable() {
			public void run() {
				System.out.println("start:"+Thread.currentThread().getName());
				new TArray<String>("a","b").eq("a","b");
			}
		}).start();
		
		new RepeatOf(2, new Runnable() {

			@Override
			public void run() {
				System.out.println("start strings:"+Thread.currentThread().getName());
				new TStrings("aaa", "aaa").notNull();
				new TStrings("bbb", "bbb").eq("bbb", "my error message");
			}
		}, new Runnable() {

			@Override
			public void run() {
				System.out.println("start string:"+Thread.currentThread().getName());
				new TString("a").eq("a", "my error message");
			}
		}).start();
	}
}
