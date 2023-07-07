public class IfElse {
    public static void main(String[] args) {
        int age=80;
        if (age<=18){
            System.out.println("You are child");
        }
        else if(age>18 && age<60){
            System.out.println("You are Adults");
        }
        else{
            System.out.println("Your are Retired to give vote");
        }
    }
}
