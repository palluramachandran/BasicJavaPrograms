package com.pallavi.practice;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String word = "AABABABBB";
		int count = 0;
		char[] words = word.toCharArray();
		for (int i = 0; i < word.length() - 1; i++) {
			if (words[i] == words[i + 1]) {
				count++;
			}

		}
		System.out.println(count);

	}

}
