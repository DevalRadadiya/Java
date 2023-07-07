public class Method {

    // 1)
    static void CheckAge(int age) {
        if(age>18){
            System.out.println("You are allowed to give Vote");
        }
        else{
            System.out.println("You are not allowed to give Vote");
        }
    }
    public static void main(String[] args) {
        CheckAge(20);
    }
    


    // 2)
    // static void Intro(String name,int age){
    //     System.out.println("My name is "+name+" Age is "+age);
    // }

    // public static void main(String[] args) {
    //     Intro("Deval",22);
    //     Intro("Chirag", 30);
    //     Intro("Menil",25);
    // }

    // 1)
    // static void myMethod() {
    //     System.out.println("This is method called");
    // }
    // public static void main(String[] args) {
    //     myMethod();
    //     myMethod();
    //     myMethod();
    // }
}
