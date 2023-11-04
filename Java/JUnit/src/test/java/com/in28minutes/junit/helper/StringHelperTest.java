package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper = new StringHelper();
	
	@Test
	public void test() {
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected,actual);
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
