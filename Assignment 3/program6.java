/*6)    Write an application that executes two threads. One thread 
displays Hello every 1000 milliseconds and the other displays Hi
every 2000 milliseconds. Create the threads by extending Thread class.*/ 	

class Thread1 extends Thread
 {
	String a;
	Thread1(String a)
	{
		this.a=a;
	}
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("A = "+a);
			try 
			{
				sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Thread2 extends Thread 
{
	String c;
	Thread2(String c)
	{
		this.c=c;
	}
	public void run() 
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println("C = "+c);
			try 
			{
				sleep(2000);
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}
	}
}
class SimpleThreadingDemo
 {
	public static void main(String[] arg) 
	{
		Thread1 t1=new Thread1("hello");	
		Thread2 t2=new Thread2("hi");	
		t1.start();
		t2.start();
	}
}