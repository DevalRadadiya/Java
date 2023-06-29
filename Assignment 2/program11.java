/* 11. Create first class with following specifications: Class
Name: Student Data Members: Enrollment_No, Student_Name, Semester Member
Functions: GetStudentDetails () Create second class with following
specifications: Class Name: Result Data Members: Enrollment_No, CPI and SPI
Member Functions: GetResultDetails () and DisplayResult () DisplayResult method
header must be: public void DisplayResult (Student s). */

import java.util.*;
class Student
{
	int Enrollment_No;
	String Student_Name;
	int Sem;
	Scanner sc=new Scanner(System.in);
	void GetStudentDetails()
	{
	  System.out.print("Enrollment No:");
	  Enrollment_No = sc.nextInt();
      System.out.print("Enter Student Name : ");
	  Student_Name = sc.next();
	  System.out.print("Enter Semester : ");
	  Sem = sc.nextInt();
	}
}
class Result
{
	int Enrollment_No;
	int sem;
	double CPI;
	double SPI;
	Scanner sc = new Scanner(System.in);
	 void GetResultDetails()
	 {
		 System.out.println("Result Details -");
		 System.out.print("Enter Enrollment No : ");
		 Enrollment_No = sc.nextInt();
		 System.out.print("Enter SPI : ");
		 SPI = sc.nextDouble();
		 System.out.print("Enter CPI : ");
		 CPI = sc.nextDouble();
	 }
	 void DisplayResultDetails(Student st[], int i)
	 {
		 System.out.println("Enrollment No : "+Enrollment_No);
		 System.out.println("Name : "+st[i].Student_Name);
		 System.out.println("SPI : "+SPI);
		 System.out.println("CPI : "+CPI);
	 }
}
class Program11
{
  public static void main(String str[])
  {
	  int n;
	  int Enrollment_Number;
	  int i;
	  boolean found = false;
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter number of students : ");
	  n = sc.nextInt();
	  Student st[] = new Student[n];
	  Result rs[] = new Result[n];
	  for(i = 0; i < n; i++)
	  {
		  st[i] = new Student();
		  rs[i] = new Result();
		  st[i].GetStudentDetails();
		  rs[i].GetResultDetails();
	  }
      System.out.print("Enter Enrollment No to get details : ");
	  Enrollment_Number = sc.nextInt();
	  for(i = 0; i < n; i++)
	  {
		  if(Enrollment_Number == st[i].Enrollment_No)
		  {
			  found = true;
			  break;
		  }
	  }
		  if(found == true)
		  {
			  rs[i].DisplayResultDetails(st, i);
		  }
		  else
		  {
			  System.out.print("Not Found!");
		  }
	  
  }
}