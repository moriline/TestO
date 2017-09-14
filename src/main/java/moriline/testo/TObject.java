package moriline.testo;

import java.util.Arrays;
import java.util.Collection;

/**
 * Testing for any Object.
 * <pre>
 * import testo.TObject;
 * 
 * new TObject(new Short("123")).notNull().eq(new Short("123"));
 * </pre>
 * @author Moriline
 *
 */
public final class TObject implements Assertive{

	//original value
	private final Object[] value;
	
	/**
	 * Constructor.
	 * @param values
	 */
	public TObject(Collection<Object> values){
		this(values.toArray(new Object[values.size()]));
	}

	/**
	 * Constructor.
	 * @param values
	 */
	public TObject(final Object ... values) {
		this.value = values;
	}
	
	/**
	 * Asserts that a value is not null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TObject notNull() {
		isTrue(this.value !=null, "value is null");
		return this;
	}
	
	/**
	 * Asserts that a value is null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TObject isNull() {
		isTrue(this.value == null, "value:"+this.value+" is not null");
		return this;
	}
	/**
	 * Asserts that a value and expected values are equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValues
	 * @return this
	 */
	public TObject eq(final Object ... expectedValues) {
		isTrue(Arrays.deepEquals(this.value, expectedValues), "value:"+this.value+" not equals to:"+expectedValues);
		return this;
	}
	/**
	 * Asserts that a value and expected values are not equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValues
	 * @return this
	 */
	public TObject notEq(final Object ... expectedValues) {
		isTrue(!Arrays.deepEquals(this.value, expectedValues), "value:"+this.value+" is equals to:"+expectedValues);
		return this;
	}
	
	/**
	 * Asserts that a value is same as expected values.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValues
	 * @return this
	 */
	public TObject same(final Object ... expectedValues) {
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
	public TObject notSame(final Object ... expectedValues) {
		int size = this.value.length;
		for(int i=0;i<size;i++){
			isTrue(this.value[i] != expectedValues[i], "value:"+this.value[i]+" is same to:"+expectedValues[i]);
		}
		return this;
	}
	
	/**
	 * Get original value.
	 * @return Object
	 */
	public Object[] get() {
		return this.value;
	}
	
	public static void main(String[] args) {
		
	}
}