/* 2. WAP to perform mathematical operation create a class
called AddSub with attributes num1 and num2 of type int, also define methods
calAdd( ) and calSub( ) to calculate addition and subtraction .Create another
class MulDiv that extends AddSub class to use member a data of super class.
MulDiv should have methods calMul( ) & calDiv( ) to calculate
multiplication and division. A main method should access the methods and
perform operations. */

class Addsub
{
	int n=5,m=5;
    int calAdd()
	{
		return n+m;
	}
	int calSub()
	{
		return n-m;
	}
}
class MulDiv extends Addsub
{
    int calMul()
	{
		return n*m;	
	}
	int calDiv()
	{
		return n/m;	
	}
}
class pro2
{
	public static void main(String str[])
	{
		Addsub a=new Addsub();
		MulDiv b=new MulDiv();
		a=b;
		System.out.println("5+5="+a.calAdd());
        System.out.println("5-5="+a.calSub());
        System.out.println("5*5="+b.calMul());
		System.out.println("5/5="+b.calDiv());		
	}
	
}