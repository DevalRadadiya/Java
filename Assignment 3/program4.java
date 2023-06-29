/*4) Rewrite above example with finally block.*/

import java.util.*;
class MyException extends ArithmeticException
{
	MyException(String str)
	{
		super(str);
	}
}
class MyExceptionDemo
{
	static void compute (int a)
	{
		if(a>10)
		{
			throw new MyException("Greater than 10..");
		}
		else
		{
			System.out.print(a);
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
		finally
		{
			System.out.print("Enter Value Lesser than 10...");
		}
	}
}
	