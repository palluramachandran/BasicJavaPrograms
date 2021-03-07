package com.pallavi.practice;

public class CompareSubString {
	public static void main(String[] args) {
		String firstWord = "cat";
		String secondWord = "mnj";
		boolean booleanSameString =false;
//		char[] firstWords = firstWord.toCharArray();
//		char[] secondWords = secondWord.toCharArray();

		for (int i = 0; i < firstWord.length(); i++) {
//			for (int j = 0; j < secondWord.length(); j++) {

			if (secondWord.contains(String.valueOf(firstWord.charAt(i)))) {
					booleanSameString = true;
				}
//			}
		}
		System.out.println(booleanSameString?"YES":"NO");

	}

}
