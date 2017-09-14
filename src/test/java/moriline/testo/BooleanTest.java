package moriline.testo;

public class BooleanTest {

	public static void main(String[] args) {
		new TBoolean(Boolean.FALSE).eq(Boolean.FALSE).notNull().isFalse();
		new TBoolean(Boolean.TRUE).eq(Boolean.TRUE).notNull().isTrue();
		
		int[] array = new int[0];
		new TObject(array).notNull();
		new TBoolean(array.length == 0).isTrue();
		new TBoolean(array.length != 1).isTrue();
		
	}
}
