package de.sveri.leetcode;

import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		// return bruteForce(nums, target);
		return hashMap(nums, target);
	}

	public int[] hashMap(int[] nums, int target) {
		var m = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			var currNumber = nums[i];

			var numberToLookFor = target - currNumber;

			if (m.containsKey(numberToLookFor)) {
				return new int[] { m.get(numberToLookFor), i };
			}

			if (!m.containsKey(currNumber)) {
				m.put(currNumber, i);
			}

		}

		return new int[] { 1, 1 };
	}

	public int[] bruteForce(int[] nums, int target) {
		int[] out = new int[2];
		boolean found = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					out[0] = i;
					out[1] = j;
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}
		return out;
	};

}
