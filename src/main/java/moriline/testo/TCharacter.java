package moriline.testo;

import java.util.Arrays;
import java.util.Collection;

/**
 * Testing for array of character.
 * <pre>
 * import testo.TCharacter;
 * 
 * new TCharacter(new Character('c')).notNull().equals(new Character('c'));
 * </pre>
 * @author Moriline
 *
 */
public final class TCharacter implements Assertive{

	//original value
	private final Character[] value;

	/**
	 * Constructor.
	 * @param values
	 */
	public TCharacter(Collection<Character> values){
		this(values.toArray(new Character[values.size()]));
	}

	/**
	 * Constructor.
	 * @param values
	 */
	public TCharacter(Character ... values) {
		this.value = values;
	}
	
	/**
	 * Asserts that a value is not null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TCharacter notNull() {
		isTrue(this.value !=null, "value is null");
		return this;
	}
	
	/**
	 * Asserts that a value is null.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @return this
	 */
	public TCharacter isNull() {
		isTrue(this.value == null, "value:"+this.value+" is not null");
		return this;
	}
	
	/**
	 * Asserts that a value and expected values are equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValues
	 * @return this
	 */
	public TCharacter eq(final Character ... expectedValues) {
		isTrue(Arrays.deepEquals(this.value, expectedValues), "value:"+this.value+" is not equals to:"+expectedValues);
		return this;
	}
	
	/**
	 * Asserts that a value and expected value are equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param stream
	 * @return this
	 */
	public TCharacter eq(final Collection<Character> collection) {
		isTrue(Arrays.deepEquals(this.value, collection.toArray()), "value:"+this.value+" is not equals to:"+collection.toArray());
		return this;
	}
	
	/**
	 * Asserts that a value and expected values are not equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValues
	 * @return this
	 */
	public TCharacter notEq(final Character ... expectedValues) {
		isTrue(!Arrays.deepEquals(this.value, expectedValues), "value:"+this.value+" is equals to:"+expectedValues);
		return this;
	}
	
	/**
	 * Asserts that a value and expected value are not equals.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param collection
	 * @return this
	 */
	public TCharacter notEq(final Collection<Character> collection) {
		isTrue(!Arrays.deepEquals(this.value, collection.toArray()), "value:"+this.value+" is equals to:"+collection.toArray());
		return this;
	}
	
	/**
	 * Asserts that a value is same as expected values.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TCharacter same(final Character ... expectedValues) {
		int size = this.value.length;
		for(int i=0;i<size;i++){
			isTrue(this.value[i] == expectedValues[i], "value:"+this.value[i]+" is not same to:"+expectedValues[i]);			
		}
		return this;
	}
	
	/**
	 * Asserts that a value is not same as expected values.
	 * If it is not, an {@link AssertionError} will be thrown.
	 * @param expectedValue
	 * @return this
	 */
	public TCharacter notSame(final Character ... expectedValues) {
		int size = this.value.length;
		for(int i=0;i<size;i++){
			isTrue(this.value[i] != expectedValues[i], "value:"+this.value[i]+" is same to "+expectedValues[i]);
		}
		return this;
	}
	
	/**
	 * Get original value.
	 * @return Character
	 */
	public Character[] get() {
		return this.value;
	}
	
	public static void main(String[] args) {
		
	}
	
}
