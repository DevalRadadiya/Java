// 9) Write a program that will copy one file into other file.

import java.io.FileInputStream;
import java.io.FileOutputStream;
class FileDemo
{
	public static void main(String args[])
	{
		byte array[]= new byte[500];
		try
		{
			FileInputStream fi=new FileInputStream("d:\\deval.txt");
			FileOutputStream fo=new FileOutputStream("d:\\dcr.txt");
			fi.read(array);
			fo.write(array);
			System.out.println("The deval.txt file is copied to dcr.txt ...");
			fi.close();
			fo.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}