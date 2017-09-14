package moriline.testo;

import java.util.Arrays;
import java.util.Collection;

/**
 * Testing for collection of any objects.
 * <pre>
 * Collection<String>collection = new TCollection<String>(Arrays.asList("a","b")).contains(Arrays.asList("a","b")).eq(Arrays.asList("a","b")).get();
 * </pre>
 * 
 * @author Moriline
 * @param <T>
 */
public final class TCollection<T> implements Assertive{

	//original value
	private final Collection<T> value;

	/**
	 * Constructor.
	 * @param value
	 */
	public TCollection(Collection<T> value) {
		this.value = value;
	}
	
	/**
	 * Asserts that a value is empty.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TCollection<T> isEmpty() {
		isTrue(this.value.isEmpty(), "value:"+this.value+" not empty");
		return this;
	}
	
	/**
	 * Asserts that a value is not empty.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TCollection<T> notEmpty() {
		isTrue(!this.value.isEmpty(), "value:"+this.value+" is empty");
		return this;
	}
	
	/**
	 * Asserts that a value is not null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TCollection<T> notNull() {
		isTrue(this.value !=null, "value is null");
		return this;
	}
	
	/**
	 * Asserts that a value is null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TCollection<T> isNull() {
		isTrue(this.value == null, "value:"+this.value+" is not null");
		return this;
	}
	/**
	 * Asserts that a size of value and size of expected value are equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TCollection<T> eqSize(final int expectedValue) {
		isTrue(this.value.size() == expectedValue, "value:"+this.value.size()+" size is not equals to:"+expectedValue);
		return this;
	}
	
	/**
	 * Asserts that a value contains all of expected value.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TCollection<T> contains(final Collection<T> values) {
		isTrue(this.value.containsAll(values));
		return this;
	}
	
	/**
	 * Asserts that a value contains all of expected value.
	 * If it is not, an {@link AssertionError} will be thrown with the message.
	 * @param values
	 * @param message
	 * @return this
	 */
	public TCollection<T> contains(final Collection<T> values, final CharSequence message) {
		isTrue(this.value.containsAll(values), message);
		return this;
	}
	
	/**
	 * Asserts that a value and expected value are equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param values
	 * @return this
	 */
	public TCollection<T> eq(final Collection<T> values) {
		isTrue(Arrays.deepEquals(this.value.toArray(), values.toArray()));
		return this;
	}
	
	/**
	 * Asserts that a value and expected value are equals.
	 * If it is not, an {@link AssertionError} will be thrown with the message.
	 * @param values
	 * @param message
	 * @return this
	 */
	public TCollection<T> eq(final Collection<T> values, final CharSequence message) {
		isTrue(Arrays.deepEquals(this.value.toArray(), values.toArray()), message);
		return this;
	}
	
	/**
	 * Get original value.
	 * @return Collection value
	 */
	public Collection<T> get() {
		return this.value;
	}
	
	public static void main(String[] args) {
		
	}
}
