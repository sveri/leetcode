package de.sveri.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import de.sveri.leetcode.easy.ListNode;
import de.sveri.leetcode.easy.MergeTwoLists;

public class MergeTwoListsTest {

	@Test
	void simpleTest() throws Exception {
//		var l = new ListNode(1);
//		var ll = new ListNode(2, l);
//		var lll = new ListNode(3, ll);
		var fl = createList(new int[] { 1, 2, 4 });
		var sl = createList(new int[] { 1, 3, 4 });
		assertEquals(createList(new int[] { 1, 1, 2, 3, 4, 4 }), new MergeTwoLists().mergeTwoLists(fl, sl));
	}

	private static ListNode createList(int[] ints) {
		ListNode l = null;

//		for (int i : ints) {
		for (int i : IntStream.rangeClosed(1, ints.length).map(i -> ints[ints.length - i]).toArray()) {
			if (l == null) {
				l = new ListNode(i);
			} else {
				l = new ListNode(i, l);
			}
		}
		return l;
	}

}
