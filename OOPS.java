abstract class Animal{
    abstract void walk();
}
public class Horse extends Animal{
    public void walk(){

        System.out.println("Walks on 4 legs");
    }
}
public class Ckicken extends Animal{
    public void walk(){

        System.out.println("Walks on 2 legs");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Horse h1= new Horse();
        h1.walk();

        Animal a1=new Animal();
        a1.walk();
            }
        }
    }
}
