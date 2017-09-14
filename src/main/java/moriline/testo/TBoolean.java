package moriline.testo;
/**
 * Testing for boolean values.
 * <pre>
 * import testo.TBoolean;
 *    ...
 *    new TBoolean(true).isTrue();
 * </pre>
 * @author Moriline
 *
 */
public final class TBoolean implements Assertive{

	//original value
	private final Boolean value;

	/**
	 * Constructor.
	 * @param value
	 */
	public TBoolean(final Boolean value) {
		this.value = value;
	}
	
	/**
	 * Asserts that a value is not null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TBoolean notNull() {
		isTrue(this.value != null, "value is null");
		return this;
	}
	
	/**
	 * Asserts that a value is null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TBoolean isNull() {
		isTrue(this.value == null, "value:"+this.value+" is not null");
		return this;
	}
	
	/**
	 * Asserts that a value and expected values are equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TBoolean eq(final Boolean expectedValue) {
		isTrue(this.value.equals(expectedValue), "value:"+this.value+" not equals to:"+expectedValue);
		return this;
	}
	
	/**
	 * Asserts that a value and expected values are not equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TBoolean notEq(final Boolean expectedValue) {
		isTrue(!this.value.equals(expectedValue), "value:"+this.value+" is equals to:"+expectedValue);
		return this;
	}
	
	/**
	 * Asserts that a value is true.
	 * @return this
	 */
	public TBoolean isTrue() {
		isTrue(this.value.booleanValue() == true, "value:"+this.value+" is false, but must be true");
		return this;
	}
	
	/**
	 * Asserts that a value is false.
	 * @return this
	 */
	public TBoolean isFalse() {
		isTrue(this.value.booleanValue() == false, "value:"+this.value+" is true, but must be false");
		return this;
	}
	
	/**
	 * Get original value.
	 * @return Boolean original value
	 */
	public Boolean get() {
		return this.value;
	}
}
