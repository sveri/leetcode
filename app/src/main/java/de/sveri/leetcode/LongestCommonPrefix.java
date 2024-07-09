package de.sveri.leetcode;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();

		var wordCount = strs.length;

		for (int i = 0; i < 200; i++) {
			var same = false;

			for (int j = 0; j < wordCount; j++) {

				if (strs[j].length() <= i) {
					same = false;
					break;
				}

				if (j == 0) {
					same = true;
				} else if (strs[j].charAt(i) == strs[0].charAt(i)) {
					same = true;
				} else {
					same = false;
					break;
				}

			}

			if (same) {
				sb.append(strs[0].charAt(i));
			} else {
				break;
			}
		}

		return sb.toString();
	}

}
