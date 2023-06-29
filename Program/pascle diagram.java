class Pascal
{
	public static void main(String[] s)
	{
		int a=5;
		for(int i=1;i<=a;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			int l=1;
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+l)
			}
			System.out.println();
		}
	}
}