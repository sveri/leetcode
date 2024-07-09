package de.sveri.leetcode.easy;

public class RomanToInteger {

	public int romanToInt(String s) {
		int number = 0;

		for (int i = 0; i < s.length(); i++) {
			var c = s.charAt(i);
			char lookAheadC = Character.MIN_VALUE;

			if (hasLookAhead(s, i)) {
				lookAheadC = s.charAt(i + 1);
			}

			switch (c) {
			case 'I': {
				if (hasLookAhead(s, i) && lookAheadC == 'V') {
					number += 4;
					i++;
				} else if (hasLookAhead(s, i) && lookAheadC == 'X') {
					number += 9;
					i++;
				} else {
					number += 1;
				}
				break;
			}
			case 'V': {
				number += 5;
				break;
			}
			case 'X': {
				if (hasLookAhead(s, i) && lookAheadC == 'L') {
					number += 40;
					i++;
				} else if (hasLookAhead(s, i) && lookAheadC == 'C') {
					number += 90;
					i++;
				} else {
					number += 10;
				}
				break;
			}
			case 'L': {
				number += 50;
				break;
			}
			case 'C': {
				if (hasLookAhead(s, i) && lookAheadC == 'D') {
					number += 400;
					i++;
				} else if (hasLookAhead(s, i) && lookAheadC == 'M') {
					number += 900;
					i++;
				} else {
					number += 100;
				}
				break;
			}
			case 'D': {
				number += 500;
				break;
			}
			case 'M': {
				number += 1000;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + c);
			}
		}

		return number;
	}

	private boolean hasLookAhead(String s, int i) {
		return i < s.length() - 1;
	}

}
