/* 7. Write a program to do the following using in-built
methods in the string class of Java. a. Find the 3rd character in the string
University b. Find the index of character o in string Java
Programming. c. Convert the string Be Positive to uppercase.
d. Replace character 'l' with 'i' in the string hello. */

class Program7
{
	public static void main(String str[])
	{
		String s1=new String("University");
		String s2=new String("Java Programming");
		String s3=new String("Be Positive");
		String s4=new String("hello");
		char a=s1.charAt(3);
		int b=s2.indexOf("o");
		String c=s3.toUpperCase();
		String d=s4.replace("l","i");
		System.out.println("3rd character in the string -University==="+a);
		System.out.println("the index of character 'o' in string -Java Programming==="+b);
		System.out.println("the string- Be Positive -to uppercase==="+c);
		System.out.println("Replace character 'l' with 'i' in the string -hello==="+d);
	}
}