package com.pallavi.practice;

public class CompareSubString {
	public static void main(String[] args) {
		String firstWord = "cat";
		String secondWord = "mnj";
		boolean booleanSameString = false;
		for (int i = 0; i < firstWord.length(); i++) {
			if (secondWord.contains(String.valueOf(firstWord.charAt(i)))) {
				booleanSameString = true;
				break;
			}
		}
		System.out.println(booleanSameString ? "YES" : "NO");

	}

}
