/*3)  Write a program to create user define exception MyException. 
	Define a class ExceptionDemo that has a method named compute( ) 
	which throws a MyException object, when compute( )’s integer 
	parameter is greater than 10.*/

import java.util.*;
class MyException extends ArithmeticException
{
	MyException(String str)
	{
		super(str);
	}
}
class ExceptionDemo
{
	static void compute (int a)
	{
		if(a>10)
		{
			throw new MyException("Greater than 10..");
		}
		else
		{
			System.out.print("Less than 10");
		}
	}
	public static void main (String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value :");
		int a =sc.nextInt();
		try
		{
			compute(a);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}
	