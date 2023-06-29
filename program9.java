//9) Write a program that will copy one file into other file.
import java.io.FileInputStream;
import java.io.FileOutputStream;
class FileDemo
{
	public static void main (String args[])
	{
		byte [] array = new byte[500];
		try
		{
			//C:\\oracle/kp
			FileInputStream fi=new FileInputStream("C:\\JAVA PPT & PDF/kp1.txt");
			FileOutputStream fo=new FileOutputStream("C:\\JAVA PPT & PDF/newfile.txt");
			fi.read(array);
			fo.write(array);
			System.out.println("The kp1.txt file is copied to Newfile ..");
			fi.close();
			fo.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}