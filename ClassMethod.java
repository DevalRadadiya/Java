public class ClassMethod {

    public void fullThrottle(){
        System.out.println("This car is going Fast");
    }

    public void speed(int maxSpeed){
        System.out.println("Max speed: " + maxSpeed);
    }

    public static void main(String[] args) {
        ClassMethod car = new ClassMethod();
        car.fullThrottle();
        car.speed(100);
    }
    // static void myStaticMethod(){
    //     System.out.println("Static methods can be called without creating objects");
    // }

    // public void myPublicMethod(){
    //     System.out.println("Public methods can be called by creating objects");
    // }


    // public static void main(String[] args) {
    //     myStaticMethod();

    //     ClassMethod cm=new ClassMethod();
    //     cm.myPublicMethod();
    // }
}
