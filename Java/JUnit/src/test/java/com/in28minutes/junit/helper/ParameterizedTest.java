package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	
	StringHelper helper = new StringHelper();
	private String input;
	private String output;
	
	public ParameterizedTest(String input, String output) {
		super();
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs [][]= {{"AACD", "CD"}, {"ACD","CD"}};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void test() {
		String actual = helper.truncateAInFirst2Positions(input);
		String expected = output;
		assertEquals(expected,actual);
	}

}
