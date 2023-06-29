/* 5. Write a program that finds the length of the string. And also display a sub-string formed by the last five characters
of the string. ( use String class) */

class program5
{
 public static void main(String str[])
 {
	String s1,s2;
	s1="Java Programming";
	s2=s1.substring(11,16);
	 int i=s1.length();
	 System.out.println("String length of Java Programming:"+i);
	 System.out.println("sub-string form last 5 characters:"+s2);
 }
}