//Factorial of a number using command line arguments.

//import java.util.*;
class Factorial
{
	public static void main(String[] str)
	{
		int fact=1,f,j;
		if(str.length>0)
		{
			j=Integer.parseInt(str[0]);
			f=1;
			while(f<=j)
			{
				fact=fact*f;
				f=f+1;
			}
			System.out.println("********************");
		}
		else
		{
			System.out.println("********************");
			System.out.println("Plese Enter The Number : ");
			System.out.println("********************");
		}
	}
}