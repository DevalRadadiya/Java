/*2) Write an application that accepts three values for marks as 
the command line arguments and find out the percentage. This
should generate the NumberFormatException if an element is incorrectly formatted.*/

class NumberFormatExceptionDemo
{
	public static void main(String arg[])
	{
		try
		{
			int sub1 = Integer.parseInt(arg[0]);
			int sub2 = Integer.parseInt(arg[1]);
			int sub3 = Integer.parseInt(arg[2]);
			System.out.print("Percentage : "+(double)(sub1+sub2+sub3)/3);
		}
		catch(NumberFormatException e1)
		{
			System.out.println(e1);
		}
	}
}