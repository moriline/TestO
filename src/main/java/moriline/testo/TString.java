package moriline.testo;

/**
 * Testing for String class.
 * <pre>
 * import testo.TString;
 * 
 * new TString("c").notNull().notEmpty().equals("c");
 * </pre>
 * @author Moriline
 *
 */
public final class TString implements Assertive{

	//original value
	private final CharSequence value;
	
	/**
	 * Constructor.
	 * @param value
	 */
	public TString(final CharSequence value){
		this.value = value;
	}
	
	/**
	 * Constructor.
	 * @param value
	 */
	public TString(final char[] value){
		this(new String(value));
	}
	
	/**
	 * Constructor.
	 * @param value
	 */
	public TString(final byte[] value){
		this(new String(value));
	}
	
	/**
	 * Asserts that a value is not null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TString notNull() {
		isTrue(this.value != null, "value is null");
		return this;
	}
	
	/**
	 * Asserts that a value is not null.
	 * If it is not, an {@link AssertionError} will be thrown with message.
	 * @param message
	 * @return this
	 */
	public TString notNull(final CharSequence message) {
		isTrue(this.value != null, message);
		return this;
	}
	
	/**
	 * Asserts that a value is null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TString isNull() {
		isTrue(this.value == null, "value:"+this.value+" is not null");
		return this;
	}

	/**
	 * Asserts that a value is null. 
	 * If it is not, an {@link AssertionError} will be thrown with message.
	 * @param message
	 * @return  this
	 */
	public TString isNull(final CharSequence message) {
		isTrue(this.value == null, message);
		return this;
	}

	/**
	 * Asserts that a value is not empty.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * Testing of original value is not empty.
	 * @return this
	 */
	public TString notEmpty() {
		isTrue(this.value.length() != 0,"value is empty");
		return this;
	}
	
	/**
	 * Asserts that a value is empty.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * Testing of original value is not empty.
	 * @return this
	 */
	public TString isEmpty() {
		isTrue(this.value.length() == 0,"value:"+this.value+" is not empty");
		return this;
	}
	
	/**
	 * Asserts that a value is not empty.
	 * If it is not, an {@link AssertionError} will be thrown with message.
	 * @param message
	 * @return this
	 */
	public TString notEmpty(final CharSequence message) {
		isTrue(this.value.length() != 0, message);
		return this;
	}
	
	/**
	 * Asserts that a value is equals to expected value.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TString eq(final String expectedValue) {
		isTrue(this.value.equals(expectedValue), "value:"+this.value+" is not equals to:"+expectedValue);
		return this;
	}
	
	/**
	 * Asserts that a value is equals to expected value.
	 * If it is not, an {@link AssertionError} will be thrown with message.
	 * @param expectedValue
	 * @param message
	 * @return  this
	 */
	public TString eq(final String expectedValue, final CharSequence message) {
		isTrue(this.value.equals(expectedValue), message);
		return this;
	}
	
	/**
	 * Asserts that a value is not equals to expected value.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TString notEq(final String expectedValue) {
		isTrue(!this.value.equals(expectedValue), "value:"+this.value+" not equals to:"+expectedValue);
		return this;
	}
	
	/**
	 * Asserts that a value is not equals to expected value.
	 * If it is not, an {@link AssertionError} will be thrown with message.
	 * @param expectedValue
	 * @param message
	 * @return  this
	 */
	public TString notEq(final String expectedValue, final CharSequence message) {
		isTrue(!this.value.equals(expectedValue), message);
		return this;
	}
	
	/**
	 * Asserts that a value is same as expected value.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TString same(final String expectedValue) {
		isTrue(this.value == expectedValue, "value:"+this.value+" is not same to:"+expectedValue);
		return this;
	}
	
	/**
	 * Asserts that a value is same as expected value.
	 * If it is not, an {@link AssertionError} will be thrown with message.
	 * @param expectedValue
	 * @param message
	 * @return this
	 */
	public TString same(final String expectedValue, final CharSequence message) {
		isTrue(this.value == expectedValue, message);
		return this;
	}
	
	/**
	 * Asserts that a value is not same as expected value.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TString notSame(final String expectedValue) {
		isTrue(this.value != expectedValue, "value:"+this.value+" is same to:"+expectedValue);
		return this;
	}
	
	/**
	 * Asserts that a value is not same as expected value.
	 * If it is not, an {@link AssertionError} will be thrown with message.
	 * @param expectedValue
	 * @param message
	 * @return this
	 */
	public TString notSame(final String expectedValue, final CharSequence message) {
		isTrue(this.value != expectedValue, message);
		return this;
	}
	
	/**
	 * Get original value.
	 * @return CharSequence
	 */
	public CharSequence get() {
		return this.value;
	}
	
	public static void main(String[] args) {
		
	}
}
