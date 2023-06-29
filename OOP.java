class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writting Sommething");
    }
}
public class OOPS{
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color("Blue");
        pen1.type("Pentonic");

        pen1.write();
        System.out.println(pen1.color);
        System.out.println(pen1.type);
    }
}