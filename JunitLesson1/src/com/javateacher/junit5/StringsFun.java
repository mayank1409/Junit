package com.javateacher.junit5;

public class StringsFun {

	public int length(String str) {
		if (str == null) {
			return 0;
		}

		int length = 0;
		for (char c : str.toCharArray()) {
			length++;
		}
		return length;
	}

	public String convertToUpperCase(String str) {
		if (str == null) {
			return null;
		}

		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				int ch = str.charAt(i) - 32;
				answer += (char) ch;
			} else {
				answer += (char) str.charAt(i);
			}
		}
		return answer;
	}

	public String convertToLowerCase(String str) {
		if (str == null) {
			return null;
		}

		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				int ch = str.charAt(i) + 32;
				answer += (char) ch;
			} else {
				answer += (char) str.charAt(i);
			}
		}
		return answer;
	}
}
