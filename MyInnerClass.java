class OuterClass {
    int x=10;

    static class InnerClass{
        int y=5;
    }
}

public class MyInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass mix=new OuterClass.InnerClass();
        System.out.println(mix.y);
    }
}
