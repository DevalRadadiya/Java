/* 4.Write a Java program to Print pascal
triangle */
class program4
{
	public static void main(String[] str)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k<=5;k++)
			{
				System.out.print("  ");
			}
			int c=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print("   "+c);
				c=c*(i-j)/j;
			}
			System.out.println();
		}
	}
}