package moriline.testo;

import java.util.Map;

/**
 * Testing for any Map of any classes.
 * <pre>
 * import testo.TMap;
 * 
 * Map<Long, String>testMap = new HashMap<Long, String>();
	testMap.put(1L, "a");testMap.put(2L, "b");
	Map<Long, String>res = new TMap<Long, String>(testMap).notNull().eqSize(2).get();
 * </pre>
 * @author Moriline
 * @param <K, V>
 */
public final class TMap<K, V> implements Assertive{

	//original value
	private final Map<K, V> value;

	/**
	 * Constructor.
	 * @param value
	 */
	public TMap(final Map<K, V> value) {
		this.value = value;
	}
	
	/**
	 * Asserts that a value is empty.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TMap<K, V> isEmpty() {
		isTrue(this.value.isEmpty(), "value:"+this.value+" not empty");
		return this;
	}
	
	/**
	 * Asserts that a value is not empty.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TMap<K, V> notEmpty() {
		isTrue(!this.value.isEmpty(), "value:"+this.value+" is empty");
		return this;
	}
	
	/**
	 * Asserts that a value is not null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TMap<K, V> notNull() {
		isTrue(this.value !=null, "value is null");
		return this;
	}
	
	/**
	 * Asserts that a value is null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TMap<K, V> isNull() {
		isTrue(this.value == null, "value:"+this.value+" is not null");
		return this;
	}
	/**
	 * Asserts that a size of value and size of expected value are equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TMap<K, V> eqSize(final int expected) {
		isTrue(this.value.size() == expected, "size is not equals to "+expected);
		return this;
	}
	
	/**
	 * Get original value.
	 * @return Map<K, V> value
	 */
	public Map<K, V> get() {
		return this.value;
	}
	
	public static void main(String[] args) {
		
	}
}
