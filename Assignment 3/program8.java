/*8) Write a Java program that takes the file name as command line argument
 and print file contents on the screen.*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
class program8
{
	public static void main(String args[])
	{
		try
		{				
			FileInputStream fi=new FileInputStream("d:\\deval.txt");
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