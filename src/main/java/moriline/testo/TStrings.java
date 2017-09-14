package moriline.testo;

import java.util.Collection;

/**
 * Testing for array or collection of the strings.
 * <pre>
 * new TStrings("aaa", "aaa").notNull();
 * new TStrings("bbb", "bbb").eq("bbb", "my error message");
 * </pre>
 * 
 * @author Moriline
 *
 */
public final class TStrings implements Assertive{
	//original value
	private final CharSequence[] values;
		
	/**
	 * Constructor.
	 * @param values
	 */
	public TStrings(Collection<CharSequence> values) {
		this(values.toArray(new CharSequence[values.size()]));
	}
	
	/**
	 * Constructor.
	 * @param values
	 */
	public TStrings(CharSequence ... values){
		this.values = values;
	}
	
	/**
	 * Asserts that a value is not null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TStrings notNull() {
		for (CharSequence value : this.values) {
			isTrue(value != null, "value is null");
		}
		return this;
	}

	/**
	 * Asserts that a value is not null.
	 * If it is not, an {@link AssertionError} will be thrown with message.
	 * @param message
	 * @return this
	 */
	public TStrings notNull(final CharSequence message) {
		for (CharSequence value : this.values) {
			isTrue(value != null, message);
		}
		return this;
	}
	
	/**
	 * Asserts that a value is equals to expected value.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TStrings eq(final String expectedValue) {
		for(CharSequence value : this.values){
			isTrue(value.equals(expectedValue), "value:"+value+" not equals to:"+expectedValue);
		}
		return this;
	}
	
	/**
	 * Asserts that a value is equals to expected value.
	 * If it is not, an {@link AssertionError} will be thrown with message.
	 * @param expectedValue
	 * @param message
	 * @return this
	 */
	public TStrings eq(final String expectedValue, final CharSequence message) {
		for(CharSequence value : this.values){
			isTrue(value.equals(expectedValue), message);
		}
		return this;
	}
	
	/**
	 * @return values CharSequence[]
	 */
	public CharSequence[] get() {
		return this.values;
	}

	public static void main(String[] args) {
		
	}
	
}
