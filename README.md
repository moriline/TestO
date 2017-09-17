# TestO
TestO is library for testing Java classes

TestO is a tool that replacements `JUnit` to make it much easier to test your own Java classes.
Now the testing is very simple. Just write your code like in exampes and if it will be wrong an `AssertionError` will be thrown.

For better programming you can produce self-testing code by writing tests after writing code.
Just put your test code to `main` method of tested class and this will be called the [**self-testing code**][1]
And you will have tests for the class in the class itself.

For example you have a Movie class and you need to test it:
```java
import moriline.testo.TNumber;

public final class Movie {

	private final Integer price;
	
	public Movie(Integer priceValue) {
		this.price = priceValue;
	}

	public Integer calculateValue(int x) {
		return this.price * 2 * x;
	}

	public static void main(String[] args) {
		new TNumber(new Movie(2).calculateValue(2)).notNull().eq(8);
		new TNumber(new Movie(3).calculateValue(3)).notNull().eq(18);
		new TNumber(new Movie(4).calculateValue(2)).notNull().eq(16);
	}
}

```


Other Examples:
----------------------
Testing of the String or an array of Strings.

```java
import moriline.testo.TString;

public static void main(String[] args) {
    new TString("c").notNull().notEmpty().equals("c");
    new TString(new char[]{'a','b'}).notNull().notEmpty();
    new TString("a").eq("a", "My error message");

    new TStrings("bbb",  "bbb").notNull().eq("bbb", "my error message");
}
```
Testing of the ANY numbers(ints, longs ans so on).
```java
import moriline.testo.TNumber;

public static void main(String[] args) {
    new TNumber(new Integer(1)).notNull().eq(1);
    new TNumber(new Integer(1), new Integer(2), new Integer(3)).notNull().eq(1,2,3);
}
```
Testing of the arrays, collections or maps.  
```java

public static void main(String[] args) {
	new TArray<String>(new String[] { "a", "b" }).notNull().notEmpty().eqSize(2);
	new TArray<Long>(1L, 2L, 3L).notNull().notEmpty().eq(1L, 2L, 3L).eqSize(3);
	new TArray<String>("a", "b", "c").eq(Arrays.asList("a", "b", "c")).eqSize(3);
	// or
	List<String> value2 = new ArrayList<String>();
	value2.add("a");
	new TCollection<String>(value2).notNull().notEmpty().eqSize(1);
	// or
	List<String> value = new ArrayList<String>();
	value.add("a");
	TCollection<String> testColl = new TCollection<String>(value);
	testColl.notNull().notEmpty().eqSize(1);
	value.add("b");
	testColl.notNull().notEmpty().eqSize(2);
	// or
	new TMap<Long, Long>(new HashMap<Long, Long>()).notNull().isEmpty();
	ConcurrentMap<String, String> map = new ConcurrentHashMap<String, String>();
	map.put("a", "b");
	TMap testMap = new TMap<String, String>(map).notNull().notEmpty().eqSize(1);
	map.put("b", "c");
	testMap.notNull().notEmpty().eqSize(2);
}
```

You can repeat the test as you like:
```java
public static void main(String[] args) {
	new RepeatOf(4, new Runnable() {
		public void run() {
			new TArray<String>("a","b").eq("a","b");
		}
	}).start();
	
	new RepeatOf(2, new Runnable() {

		@Override
		public void run() {
			new TStrings("aaa", "aaa").notNull();
			new TStrings("bbb", "bbb").eq("bbb", "my error message");
		}
	}, new Runnable() {

		@Override
		public void run() {
			new TString("a").eq("a", "my error message");
		}
	}).start();
}
```
[1]: https://en.wikipedia.org/wiki/Self-testing_code
