class fact
{
	public static void main(String[] str)
	{
		int x=Integer.parseInt(str[0]);
		int count=1;
		for(int i=x;i>0;i--)
		{
			count=count*i;
		}
		System.out.print(" "+count);
	}
	
}
