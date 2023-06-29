class Pascal{
public static void main(String[] str){
	for(int i=1;i<=7;i++)
	{
		for(int k=i;k<=7;k++)
		{
			System.out.print("   ");
		}
		int c=1;
		for(int j=1;j<=i;j++)
		{
			System.out.print("    "+c);
			c=c*(i-j)/j;
		}
		System.out.println(" ");
	}
}
}