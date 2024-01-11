package com.santhosh;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPalindrome {
	public static void main(String[] args) {
		checkPalindrome("madam");
	}

	private static void checkPalindrome(String str) {
		
		char [] input = str.toCharArray();
		StringBuffer sb = null;
		List<String> passibleMatchList = new ArrayList<>();
		for(int i = 0 ; i < input.length ; i++) {
			sb = new StringBuffer();
			for(int j=i ; j < input.length ; j++) {
				sb.append(input[j]);
				printPalindromeString(sb.toString());
				passibleMatchList.add(sb.toString());
			}
		}
		System.out.println(passibleMatchList);
	}
	
	private static void printPalindromeString(String str) {
		if(str.length()< 3) {
			return;
		}
		char [] input = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = input.length-1 ; i >= 0 ; i--) {
			sb.append(input[i]);
		}
		if(str.equalsIgnoreCase(sb.toString())) {
			System.out.println(str + " is palindrome.");
		}
	}
}
