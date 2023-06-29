import java.io.*;
class Readfile{
	public static void main(String[] str){
		try{
			FileReader fr=new FileReader("D:\\sem4\\java\\program\\array.java");
			char[] c=new char[200];
			fr.read(c);
			System.out.print(c);
		}
		catch(Exception e){}
	}
}