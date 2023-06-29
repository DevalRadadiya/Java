import java.io.*;
class Writedemo{
	public static void main(String[] str){
		try{
			FileWriter fw=new FileWriter("D:\\sem4\\java\\new.txt",false);
			fw.write("This is File Writting");
			fw.close();
		}
		catch(Exception e) {
			
		}
	}
}