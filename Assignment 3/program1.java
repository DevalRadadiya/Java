/*1) Declare an array with 2 elements. Try to access the 3rd element 
as: arr[3] = 30/0; which throws exceptions and write multiple
catch block for this. (ArrayIndexOutOfBound Exception and Arithmetic Exception)*/

class Program1
{
	public static void main(String arg[])
	{
		int arr[] = new int []{10,20};
		int ans=0;
		try
		{
			try
			{
				 ans= 30/0;
			}
			catch(ArithmeticException e2)
			{
				System.out.println(e2);
			}
			arr[2]=ans;
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}
	}
}