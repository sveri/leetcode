package de.sveri.leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import de.sveri.leetcode.easy.ValidParentheses;

public class ValidParenthesesTest {

	@Test
	void simpleTest() throws Exception {
		assertFalse(new ValidParentheses().isValid("){"));
		assertFalse(new ValidParentheses().isValid("(("));
		assertFalse(new ValidParentheses().isValid("([)]"));
		assertTrue(new ValidParentheses().isValid("()[]{}"));
		assertFalse(new ValidParentheses().isValid("(]"));
		assertFalse(new ValidParentheses().isValid("("));
		assertTrue(new ValidParentheses().isValid("()"));
	}

}
