package de.sveri.leetcode.easy;

public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode retList = new ListNode();

		int list1Index = 0;
		while (list1.next != null) {
			int list2Index = 0;
			var l1Val = list1.val;

			while (list2.next != null) {

				if (list2Index < list1Index) {
					list2 = list2.next;
					list2Index++;
					continue;
				}
				var l2Val = list2.val;

				if (l1Val < l2Val) {
					retList = new ListNode(l1Val, retList);
					retList = new ListNode(l2Val, retList);
				} else {
					retList = new ListNode(l2Val, retList);
					retList = new ListNode(l1Val, retList);
				}

				list2 = list2.next;
				list2Index++;
			}
			list1 = list1.next;
			list1Index++;
		}

		return retList;

	}

}
