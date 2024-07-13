package de.sveri.leetcode.easy;

public class IndexOfOccurrenceInString {
	public int strStr(String haystack, String needle) {

		if (!haystack.contains(needle)) {
			return -1;
		}

		for (int i = 0; i < haystack.length(); i++) {
			char charAt = haystack.charAt(i);
			if (charAt == needle.charAt(0)) {

				boolean found = true;

				for (int j = 0; j < needle.length(); j++) {
					if (needle.charAt(j) != haystack.charAt(i + j)) {
						found = false;
					}
				}
				if (found) {
					return i;
				}
			}
		}

		return 0;

	}

}
