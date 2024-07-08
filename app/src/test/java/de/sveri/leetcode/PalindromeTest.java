package de.sveri.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PalindromeTest {

	@Test
	void testSimple() throws Exception {
		assertEquals(true, new Palindrome().isPalindrome(121));
		assertEquals(false, new Palindrome().isPalindrome(-121));
		assertEquals(false, new Palindrome().isPalindrome(12215));
	}
}
