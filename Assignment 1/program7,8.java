/* 7.Write a Java Program to input Unit from the user and calculate Bill. */
import java.util.*;
class Program7
{
	public static void main(String[] str)
	{
		int units;
		double totalbill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Unit of Bill : ");
		units=sc.nextInt();
		double billpay=0;
		if(units>0 && units<100)
		{
			billpay=units*5.2;
		}
		else if(units>101 && units<200)
		{
			billpay=units*5.9;
		}
		else if(units>201 && units<400)
		{
			billpay=units*6.7;
		}
		else if(units>401 && units<600)
		{
			billpay=units*7.2;
		}
		else
		{
			billpay=units*7.6;
		}
		System.out.println("Bill to Pay : "+billpay);
		double discount=0.0;
		if(billpay>0 && billpay<500)
		{
			discount=billpay*0.3;
		}
		else if(billpay>500 && billpay<1000)
		{
			discount=billpay*0.2;
		}
		else
		{
			discount=billpay*1.5;
		}
		totalbill=billpay-discount;
		System.out.println("Toatl Bill Discount = "+discount);
		System.out.println("Total Bill : "+totalbill);
	}
}
