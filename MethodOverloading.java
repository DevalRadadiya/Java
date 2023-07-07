public class MethodOverloading {

    static int Add(int x,int y){
        return x + y;
    }

    static double Add(double x,double y){
        return x + y;
    }
    public static void main(String[] args) {
        int a=Add(5,7);
        double b=Add(4.123,6.456);

        System.out.println("Int Sum : "+a);
        System.out.println("Double Sum : "+b);
    }
}
