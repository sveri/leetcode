package de.sveri.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.sveri.leetcode.easy.RomanToInteger;

public class RomanToIntegerTest {

	@Test
	void simpleTest() throws Exception {
		assertEquals(3, new RomanToInteger().romanToInt("III"));
		assertEquals(58, new RomanToInteger().romanToInt("LVIII"));
		assertEquals(4, new RomanToInteger().romanToInt("IV"));
		assertEquals(1994, new RomanToInteger().romanToInt("MCMXCIV"));
	}

}
