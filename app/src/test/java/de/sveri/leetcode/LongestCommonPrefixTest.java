package de.sveri.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

	@Test
	void simpleTest() throws Exception {
		assertEquals("foo", new LongestCommonPrefix().longestCommonPrefix(new String[] { "foodbar", "foobaz" }));
	}

}
