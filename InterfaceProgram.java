interface Animal{
    public void animalsound();

    public void sleep();
}

interface AnimalWalk{
    public void walk();
}

class Pig implements Animal,AnimalWalk {
    public void animalsound(){
        System.out.println("The pig says Wee Wee");
    }

    public void sleep(){
        System.out.println("Zzzzzzzzzzzzzzzzzzzzz");
    }

    public void walk(){
        System.out.println("Animal walk on 4 lags");
    }
}

class interfaceProgram{
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalsound();;
        pig.sleep();
    }
}