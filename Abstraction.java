abstract class Abstraction {
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzzz...");
    }
}

class Cat extends Abstraction {
    public void animalSound(){
        System.out.println("Meow...Meow...");
    }
}

class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.animalSound();
        cat.sleep();
    }
}