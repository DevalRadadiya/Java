/* 6. Write a Java Program to Count the sum 
of an Element in an Array. */
class program6
{
	public static void main(String[] str)
	{
		int []arr=new int[]{1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of an Element in an array : "+sum);
	}
}