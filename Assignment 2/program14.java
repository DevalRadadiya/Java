/* 14. */

import java.util.*;
class Palindrome
{
	public static void checkPalindrome(String s) 
	{
		String str;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the string : ");
		str=sc.nextLine();
		String reverse = new StringBuffer(str).reverse().toString();
		if (str.equals(reverse))
		{
			System.out.println("Yes, it is a palindrome"); 
		}
		else
		{			
			System.out.println("No, it is not a palindrome");
		}
	}
	public static void main (String[] args) 
	throws java.lang.Exception 
	{ 
		checkPalindrome("str");
	}
}