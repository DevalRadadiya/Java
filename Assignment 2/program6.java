/* 6. Create a package MathPack having class mathdemo with method 
add() and sub() to find addition and subtraction. Create another program 
and `import package and invoke methods. */

import Mathpack.Mathdemo;
class Program6
{
	public static void main(String str[])
	{
		MathDemo m1=new MathDemo();
	   	System.out.println("5+6="+m1.add(5,6));
		System.out.println("7-6="+m1.sub(7,6));
	}
}