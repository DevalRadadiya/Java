class Employee
{
	int id;
	int salary;
	String name;
	public void printDetails()
	{
		System.out.println("My ID is "+id);
		System.out.println("and name is "+name);
		System.out.println("and my salary is "+salary);
	}
	public int getSalary()
	{
		return salary;
	}
}
class Customclass
{
	public static void main(String[] args)
	{
		System.out.println("This is our custom class..");
		//int salary=pratik.getSalary();
		//System.out.println(salary);
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.id=48;
		e1.name="Deval Radadiya";
		e1.salary=3000;
		e2.id=11;
		e2.name="Pratik Chudasma";
		e2.salary=3000;
		//System.out.println(dcr.id);
		//System.out.println(dcr.name);
		//System.out.println(pratik.id);
		//System.out.println(pratik.name);
		e1.printDetails();
		e2.printDetails();
	}
}