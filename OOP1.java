class Pen{
    String color;
    String type;
    
    public void write(){
        System.out.println("Writting Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

public class OOP1{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";

        pen1.write();
    }
}