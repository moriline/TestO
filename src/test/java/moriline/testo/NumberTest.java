package moriline.testo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberTest {

	public static void main(String[] args) {
		new TNumber(BigInteger.valueOf(2343444)).notNull();
		new TNumber(234454).eq(Integer.valueOf(234454));
		new TNumber(BigDecimal.valueOf(2344589));
		new TNumber(Long.valueOf(3404585));
		new TNumber(Double.valueOf(394839));
		new TNumber(new Integer(2)).notNull().eq(2);
		
		Integer a = 123;
		new TNumber(a).eq(new Integer(123));
		new TObject(a).notSame(new Integer(123));
		

		new TNumber(new Integer(1)).notNull().eq(1);
		new TNumber(new Integer(1), new Integer(2), new Integer(3)).notNull().eq(1,2,3);
		new TNumber(new Integer(1)).notNull().notEq(2);
	}
}
