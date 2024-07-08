package de.sveri.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

	@Test
	void testSimple() throws Exception {
		var nums = new int[] { 2, 7, 11, 15 };
		assertEquals(new int[] { 0, 1 }, new TwoSum().twoSum(nums, 9));
	}

}
