package org.mnr.interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramcheckTest {

	@Test
	public void testAreAnagrams() {
		assertTrue(Anagramcheck.areAnagrams("word", "wrdo"));
		assertTrue(Anagramcheck.areAnagrams("mary", "army"));
		assertTrue(Anagramcheck.areAnagrams("stop", "tops")); 
		assertTrue(Anagramcheck.areAnagrams("boat", "btoa")); 
		assertFalse(Anagramcheck.areAnagrams("pure", "in"));
		assertFalse(Anagramcheck.areAnagrams("fill", "fil")); 
		assertFalse(Anagramcheck.areAnagrams("ccc", "ccccccc"));
		assertTrue(Anagramcheck.areAnagrams("a", "a"));
		assertFalse(Anagramcheck.areAnagrams("sleep", "slep"));
		assertFalse(Anagramcheck.areAnagrams("DeBit card", "Bad credit"));

		
	}

}
