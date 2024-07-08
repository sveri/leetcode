package de.sveri.leetcode;

public class Palindrome {

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		var chars = String.valueOf(x).toCharArray();

		for (int i = 0; i < chars.length / 2; i++) {
			if (chars[i] != chars[chars.length - i - 1]) {
				return false;
			}
		}

		return true;
	}

}
