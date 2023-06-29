/* 1. Define class Human with first name and last name. Define
new class Student which is derived from Human and has new field – grade. Define
class Worker derived from Human with new field weekSalary and work-hours per
day and method MoneyPerHour() that returns money earned by hour by the worker.
Define the proper constructors and properties for this hierarchy. Create object
and demonstrate. */

class Human
{
	String fnm,lnm;
	Human(String f,String l)
	{
		fnm=f;
		lnm=l;
	}
	void print()
	{
		System.out.println("First Name : "+fnm);
		System.out.println("Last Name : "+lnm);
	}
}
class Student extends Human
{
	String grade;
	Student(String f,String l,String g)
	{
		super(f,l);
		grade=g;
	}
	void print()
	{
		super.print();
		System.out.println("Grade= "+grade);
	}
}
class Worker extends Human
{
	int WeekSalary,WorkHours;
	Worker(String f,String l,int ws,int wh)
	{
		super(f,l);
		WeekSalary=ws;
		WorkHours=wh;
	}
	void print()
	{
		super.print();
		System.out.println("Week Salary : "+WeekSalary);
		System.out.println("Work Hour : "+WorkHours);
	}
	int MoneyPerHour()
	{
		return WeekSalary/(WorkHours*7);
	}
}
class program1
{
	public static void main(String[] str)
	{
		Student s1=new Student("Deval","Radadiya","A+");
		s1.print();
		Worker w1=new Worker("Deval","Radadiya",5000,3);
		w1.print();
		System.out.print("Money per Hour : "+w1.MoneyPerHour());
	}
}