/*5) Create a class TestThread which extends class Thread and 
	show the use of sleep method.(Create 2 thread of TestThread ).*/

class TestThread extends Thread 
{
	String name;
	TestThread (String nm)
	{
		name=nm;
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(name+":"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
			
		}
	}
}
class MultiThreadDemo
{
	public static void main(String s[])
	{
		TestThread t1=new TestThread("First :");
		TestThread t2=new TestThread("Secound :");
		t1.start();
		t2.start();
	}
}