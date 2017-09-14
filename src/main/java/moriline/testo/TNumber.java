package moriline.testo;

import java.util.Arrays;
import java.util.Collection;

/**
 * Testing for any Number class and his children.
 * <pre>
 * import testo.TNumber;
 *    
 *    new TNumber(new Integer(1)).notNull().eq(1);
 * </pre>
 * @author Moriline
 *
 */
public final class TNumber implements Assertive{
	
	//original value
	private final Number[] value;
	
	/**
	 * Constructor.
	 * @param values
	 */
	public TNumber(Collection<Number> values){
		this(values.toArray(new Number[values.size()]));
	}

	/**
	 * Constructor.
	 * @param values
	 */
	public TNumber(Number ... values) {
		this.value = values;
	}
	/**
	 * Asserts that a value and expected values are equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TNumber eq(final Number ... expectedValues) {
		isTrue(Arrays.deepEquals(this.value, expectedValues), "value not equals to "+expectedValues);
		return this;
	}
	
	/**
	 * Asserts that a value and expected value are not equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValues
	 * @return this
	 */
	public TNumber notEq(final Number ... expectedValues) {
		isTrue(!Arrays.deepEquals(this.value, expectedValues),"value is equals to "+expectedValues);
		return this;
	}
	
	/**
	 * Asserts that a value is not null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TNumber notNull() {
		isTrue(this.value !=null, "value is null");
		return this;
	}
	/**
	 * Asserts that a value is null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TNumber isNull() {
		isTrue(this.value == null, "value:"+this.value+" is not null");
		return this;
	}
	
	/**
	 * Asserts that a value is same as expected values.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValues
	 * @return this
	 */
	public TNumber same(final Number ... expectedValues) {
		int size = this.value.length;
		for(int i=0;i<size;i++){
			isTrue(this.value[i] == expectedValues[i], "value:"+this.value[i]+" is not same to:"+expectedValues[i]);
		}
		return this;
	}
	
	/**
	 * Asserts that a value is not same as expected values.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValues
	 * @return this
	 */
	public TNumber notSame(final Number ... expectedValues) {
		int size = this.value.length;
		for(int i=0;i<size;i++){
			isTrue(this.value[i] != expectedValues[i], "value:"+this.value[i]+" is same to "+expectedValues[i]);
		}
		return this;
	}
	/**
	 * Get original value.
	 * @return Number original value
	 */
	public Number[] get() {
		return this.value;
	}
	
	public static void main(String[] args) {
		
	}
	
}
