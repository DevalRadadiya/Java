import java.util.Scanner;

class Main{
    /**
     * @param args
     */
    public static void main(String[] args) {
        String name;
        int age;
        double salary;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name : ");
        name=scanner.nextLine();
        System.out.print("Enter Age : ");
        age=scanner.nextInt();
        System.out.print("Enter Salary : ");
        salary=scanner.nextDouble();

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);

        scanner.close();
    }
}