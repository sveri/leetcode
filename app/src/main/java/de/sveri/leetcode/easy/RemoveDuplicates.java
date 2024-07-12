package de.sveri.leetcode.easy;

import java.util.HashSet;

public class RemoveDuplicates {

	public int removeDuplicates(int[] nums) {

		if (nums.length <= 1) {
			return nums.length;
		}

		int uniques = 0;

		var s = new HashSet<Integer>();

		int lastInt = Integer.MIN_VALUE;
		int lastUniqueIndex = 0;

		for (int i = 0; i < nums.length; i++) {

			int numAtI = nums[i];

			if (nums[i] > lastInt) {
				nums[lastUniqueIndex] = nums[i];
			}

			if (!s.contains(numAtI)) {
				s.add(numAtI);
				lastUniqueIndex++;
				uniques++;
				lastInt = nums[i];
			}

		}

		return uniques;

	}

}
