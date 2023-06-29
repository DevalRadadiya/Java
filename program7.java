/*7) Write a JAVA program that creates threads by extending Thread class .
First thread  display Good Morning every 1 sec, the second thread displays Hello every 2 seconds and the third display 
Welcome every 3 seconds ,(Repeat the same by implementing Runnable).*/
class Thread1
{
	String a;
	Thread1(String a)
	{
		this.a=a;
	}
}
class Thread2 extends Thread1 implements Runnable
{
	Thread t=new Thread(this);
	Thread2(String a)
	{
		super(a);
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(a);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Thread3 extends Thread1 implements Runnable
{
	Thread t1=new Thread(this);
	Thread3(String a)
	{
		super(a);
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(a);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Thread4 extends Thread1 implements Runnable
{
	Thread t2=new Thread(this);
	Thread4(String a)
	{
		super(a);
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(a);
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class RunnableDemo
{
	public static void main (String args[])
	{
		Thread2 t1=new Thread2("Good Morning..");
		Thread3 t2=new Thread3("Hello..");
		Thread4 t3=new Thread4("Welcome..");
		t1.t.start();
		t2.t1.start();
		t3.t2.start();
	}
}
		