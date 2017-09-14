package moriline.testo;

/**
 * The base interface for asserting condition with or without message.
 * @author Moriline
 * @see AssertionError
 * @since 0.1
 */
public interface Assertive {
	
    /**
     * Throw an {@link AssertionError} with the given message.
     * If the message is null then throw {@link AssertionError} without any message.
	 * @param message CharSequence
	 */
	default void fail(final CharSequence message){
		if (message == null) {
	        throw new AssertionError();
	    }
	    throw new AssertionError(message);
	}

	/**
	 * Asserts that a condition is true.If it is not, an {@link AssertionError}
     * is thrown without any message.
     * @param condition boolean
     */
    default void isTrue(boolean condition){
		isTrue(condition, null);
	}
	
	/**
	 * Asserts that a condition is true. If it is not, an {@link AssertionError}
     * is thrown with the given message. 
	 * @param condition boolean
	 * @param message CharSequence
	 */
	default void isTrue(boolean condition, final CharSequence message) {
        if (!condition) {
			fail(message);
        }
    }
}
