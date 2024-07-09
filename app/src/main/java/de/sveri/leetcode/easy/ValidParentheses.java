package de.sveri.leetcode.easy;

import java.util.LinkedList;

public class ValidParentheses {

	public boolean isValid(String s) {

		if (s.length() % 2 != 0) {
			return false;
		}

		var fifo = new LinkedList<Character>();

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				fifo.add(c);
			} else {
				if (fifo.isEmpty()) {
					return false;
				}

				var firstFromList = fifo.removeLast();
				if ((c == ')' && firstFromList == '(') || (c == '}' && firstFromList == '{')
						|| (c == ']') && firstFromList == '[') {
					continue;
				} else {
					return false;
				}
			}
		}

		if (!fifo.isEmpty()) {
			return false;
		}

		return true;
	}

}
