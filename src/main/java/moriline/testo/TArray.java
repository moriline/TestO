package moriline.testo;

import java.util.Arrays;
import java.util.Collection;

/**
 * Testing for array of any elements.
 * <pre>
 * import testo.TArray;
 * 
 * new TArray<String>("a","b","c").eq("a","b","c");
		new TArray<Integer>(1,2,3).eq(1,2,3);
		new TArray<Long>(1L,2L,3L).eq(1L,2L,3L);
 * </pre>
 * @author Moriline
 *
 * @param <E>
 */
public final class TArray<E> implements Assertive{

	//original value
	private final E[] value;

	/**
	 * Constructor.
	 * @param array
	 */
	@SafeVarargs
	public TArray(E ... array) {
		this.value = array;
	}
	
	/**
	 * Asserts that a value is empty.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TArray<E> isEmpty() {
		isTrue(this.value.length == 0, "value:"+this.value+" is not empty");
		return this;
	}
	
	/**
	 * Asserts that a value is not empty.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TArray<E> notEmpty() {
		isTrue(this.value.length != 0, "value is empty");
		return this;
	}
	
	/**
	 * Asserts that a value is not null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TArray<E> notNull() {
		isTrue(this.value !=null, "value is null");
		return this;
	}
	
	/**
	 * Asserts that a value is null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TArray<E> isNull() {
		isTrue(this.value == null, "value:"+this.value+" is not null");
		return this;
	}
	/**
	 * Asserts that a size of value and size of expected value are equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TArray<E> eqSize(final int expectedValue) {
		isTrue(this.value.length == expectedValue, "size value:"+this.value+" is not equals to:"+expectedValue);
		return this;
	}
	
	/**
	 * Asserts that a size of value and size of expected value are not equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TArray<E> notEqSize(final int expectedValue) {
		isTrue(this.value.length != expectedValue, "size value:"+this.value+" is not equals to:"+expectedValue);
		return this;
	}
	
	/**
	 * Asserts that a value and expected value are equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param array
	 * @return this
	 */
	@SuppressWarnings("unchecked")
	public TArray<E> eq(final E ... array) {
		isTrue(Arrays.deepEquals(this.value, array), "value:"+this.value+" is not equals to:"+array);
		return this;
	}
	
	/**
	 * Asserts that a value and expected value are equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param stream
	 * @return this
	 */
	public TArray<E> eq(final Collection<E> collection) {
		isTrue(Arrays.deepEquals(this.value, collection.toArray()), "value:"+this.value+" is not equals to:"+collection.toArray());
		return this;
	}
	
	/**
	 * Asserts that a value and expected value are not equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param array
	 * @return this
	 */
	@SuppressWarnings("unchecked")
	public TArray<E> notEq(final E ... array) {
		isTrue(Arrays.deepEquals(this.value, array), "value:"+this.value+" is equals to:"+array);
		return this;
	}
	
	/**
	 * Asserts that a value and expected value are not equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param stream
	 * @return this
	 */
	public TArray<E> notEq(final Collection<E> collection) {
		isTrue(Arrays.deepEquals(this.value, collection.toArray()), "value:"+this.value+" is equals to:"+collection.toArray());
		return this;
	}
	
	/**
	 * Get original value.
	 * @return E[]
	 */
	public E[] get() {
		return this.value;
	}
	
	public static void main(String[] args) {
		
	}
}

