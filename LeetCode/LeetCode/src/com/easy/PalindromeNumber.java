package com.easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(1201));
	}
	
	public static boolean isPalindrome(int num) {
		char arr [] = String.valueOf(num).toCharArray();
		StringBuffer str = new StringBuffer();
		for(int i = arr.length-1 ; i >= 0; i--) {
			str.append(arr[i]);
		}
		String output = str.toString();
		str = new StringBuffer();
		for (char c : arr) {
			str.append(c);
		}
		if(str.toString().equalsIgnoreCase(output)) {
			return true;
		}else {
			return false;
		}
	}

}
