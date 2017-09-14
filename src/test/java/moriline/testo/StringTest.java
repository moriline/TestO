package moriline.testo;

import moriline.testo.TString;

public class StringTest {
	
	public static void main(String[] args) {
		new TString("c").notNull().notEmpty().equals("c");
		String a = new TString(new String("a")).notNull().notEmpty().get().toString();
		new TString(new char[]{'a','b'}).notNull().notEmpty();
		
		new TString("a").eq("a", "my error message");
		
		new TStrings("aaa",  "aaa").notNull();
		new TStrings("bbb",  "bbb").eq("bbb", "my error message");
	}

}
