package de.sveri.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.sveri.leetcode.easy.RemoveElement;

public class RemoveElementTest {

	@Test
	void testSimple() throws Exception {
//		testIt(new int[] { 3, 2, 2, 3 }, 3, 2, new int[] { 2, 2, 2, 2 });
		testIt(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2, 3, new int[] { 0, 1, 4, 0, 3, 5, 6 });
	}

	private void testIt(int[] numsIn, int valToRemove, int expectedRemovedElements, int[] expectedNums) {
		int removedElements = new RemoveElement().removeElement(numsIn, valToRemove);
		assertEquals(expectedRemovedElements, removedElements);
//		var expected = new int[] { 1, 2 };
		for (int i = 0; i < removedElements; i++) {
			assertEquals(expectedNums[i], numsIn[i]);
		}
	}

}
