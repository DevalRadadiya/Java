/* 3. Write a Java program to calculate
Fibonacci Series up to n numbers. */
class program3
{
	public static void main(String[] str)
	{
		int a=0,b=1,c=0;
		System.out.print(a+" , "+b);
		for(int i=2;i<10;i++)
		{
			c=a+b;
			System.out.print(" , "+c);
			a=b;
			b=c;
		}
	}
}
