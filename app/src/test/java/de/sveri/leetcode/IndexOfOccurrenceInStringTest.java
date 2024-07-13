package de.sveri.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.sveri.leetcode.easy.IndexOfOccurrenceInString;

public class IndexOfOccurrenceInStringTest {

	@Test
	void simpleTest() throws Exception {
		assertEquals(2, new IndexOfOccurrenceInString().strStr("hello", "ll"));
		assertEquals(0, new IndexOfOccurrenceInString().strStr("sadbutsad", "sad"));
		assertEquals(-1, new IndexOfOccurrenceInString().strStr("leetcode", "leeto"));
	}

}
