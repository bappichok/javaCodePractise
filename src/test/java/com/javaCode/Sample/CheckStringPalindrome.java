package com.javaCode.Sample;

public class CheckStringPalindrome {
	
	public static void checkPalindrome(String str) {
		
		//Input: NITIN
		//Output: NITIN
		//add one flag
		int start = 0;
		int end =str.length()-1;
		
		boolean flag =true;
		
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				flag=false;
				break;
			}
			start ++;
			end --;
		}
		if(flag) {
			System.out.println(str + " is palindrome");
		}
		else
		{
			System.out.println(str + " is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		checkPalindrome("Bappi");
		checkPalindrome("BOB");
	}
	
	

}
