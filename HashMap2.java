import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> people=new HashMap<String,Integer>();

        people.put("Deval",22);
        people.put("Chirag",30);
        people.put("Menil", 25);

        for(String i : people.keySet()){
            System.out.println("Key: " + i + " Value: " + people.get(i));
        }
    }
}
