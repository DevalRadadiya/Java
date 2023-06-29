//8) Write a Java program that takes the file name as command line argument and print file contents on the screen.
import java.io.FileInputStream;
import java.io.FileOutputStream;
class program8
{
	public static void main(String args[])
	{
		//FileDemo f1=new FileDemo(args[0]);
		//byte [] array = new byte[500];
		try
		{				
			//C:\\oracle/kp
			FileInputStream fi=new FileInputStream("C:\\JAVA PPT & PDF/kp1.txt");
			int i;
			while((i=fi.read())!=-1) 
			{
				System.out.print((char)i);
			}
			fi.close();
		}
		catch(Exception e)	
		{
			System.out.println(e);
		}
	}
}