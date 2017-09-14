package moriline.testo;

public class ObjectTest {

	public static void main(String[] args) {
		new TObject(new Short("123"), new Short("654")).notNull().eq(new Short("123"), new Short("654"));
		new TObject(new Short("123")).notNull().eq(new Short("123"));
	}
}
