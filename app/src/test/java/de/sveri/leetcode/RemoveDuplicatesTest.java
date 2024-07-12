package de.sveri.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.sveri.leetcode.easy.RemoveDuplicates;

public class RemoveDuplicatesTest {

	@Test
	void testSimple() throws Exception {
		testIt(new int[] { 1, 2 }, 2, new int[] { 1, 2 });
//		testIt(new int[] {}, 0, new int[] { 1, 1 });
		testIt(new int[] { 1 }, 1, new int[] { 1, 1 });
		testIt(new int[] { 1, 1 }, 1, new int[] { 1, 1 });
		testIt(new int[] { 1, 1, 2 }, 2, new int[] { 1, 2 });
		testIt(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }, 5, new int[] { 0, 1, 2, 3, 4, 8, 9, 10 });
	}

	private void testIt(int[] numsIn, int expectedUniqeus, int[] expectedNums) {
		int countUniques = new RemoveDuplicates().removeDuplicates(numsIn);
		assertEquals(expectedUniqeus, countUniques);
//		var expected = new int[] { 1, 2 };
		for (int i = 0; i < countUniques; i++) {
			assertEquals(expectedNums[i], numsIn[i]);
		}
	}

}
