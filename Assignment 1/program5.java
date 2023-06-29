/* 5.Write a Java Program to Count the Number
of Occurrence of an Element in an Array. */
import java.util.Scanner;
class program5
{
    public static void main(String[] args) 
    {
        int n, x, count = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the element of which you want to count number of occurrences:");
        x = sc.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element:"+count);
    }
}
