/* 4. Create two interfaces Printable and Showable having
methods print( ) and show( ) respectively. Create a Test_Multiple class which
implements all 2 interfaces and override print( ) and show( ) methods. Write a
main method in this class and create an object of this class and use the
methods. */

interface Printable
{
	void print();
}
interface Showable
{
	void show();
} 
class Test_Multiple implements Printable,Showable
{
	public void print()
	{
		System.out.println("print method");
	}
	public void show()
	{
		System.out.println("show method");
	}
	public static void main(String str[])
	{
		Test_Multiple s1=new Test_Multiple();
		s1.print();
		s1.show();
	}
}