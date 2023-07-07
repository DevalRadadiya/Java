import java.util.HashMap;

public class HashMap1 {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities); 
    
    System.out.println(capitalCities.get("England"));
    System.out.println(capitalCities.size());

    for (String capital : capitalCities.values()) {
      System.out.println(capital);
    }
  }
}