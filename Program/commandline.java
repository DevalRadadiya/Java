import java.util.*;
class Command
{
	public static void main(String[] str)
	{
		String[][] val=new String[4][];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter Book No. : ");
			int n=sc.nextInt();
			val[i]=new String[n];
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter Book Name : ");
				val[i][j]=sc.next();
			}
		}
		for(int i=0;i<4;i++)
		{
			for(String bnm:val[i])
				System.out.println(bnm);
		}
		System.out.println(i,j);
	}
}