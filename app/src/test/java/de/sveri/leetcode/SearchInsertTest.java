package de.sveri.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.sveri.leetcode.easy.SearchInsert;

public class SearchInsertTest {

	@Test
	void simpleTest() throws Exception {
		assertEquals(4, new SearchInsert().searchInsert(new int[] { 1, 3, 5, 6 }, 7));
		assertEquals(1, new SearchInsert().searchInsert(new int[] { 1, 3, 5, 6 }, 2));
		assertEquals(2, new SearchInsert().searchInsert(new int[] { 1, 3, 5, 6 }, 5));
	}

}
