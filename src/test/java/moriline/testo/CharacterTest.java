package moriline.testo;

import java.util.Arrays;

public class CharacterTest {

	public static void main(String[] args) {
		new TCharacter(new Character('c')).notNull().equals(new Character('c'));
		Character character = new Character('b');
		new TCharacter(character).same(character).notSame(new Character('c'));
		
		new TCharacter('a', 'b').notNull().eq('a','b');
		
		new TCharacter().notEq(Arrays.asList('a','b','c'));
		new TCharacter(new Character('c')).notNull().eq(new Character('c'));
		new TCharacter(new Character('a'),new Character('b')).notNull().eq(new Character('a'), new Character('b'));
		
		Character[]tmp = new TCharacter(Arrays.asList('a','b')).eq(Arrays.asList('a','b')).get();
	}
}
