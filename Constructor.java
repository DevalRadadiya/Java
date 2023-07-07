// public class Constructor{
//     int x;

//     public Constructor(int y){
//         x=y;
//     }

//     public static void main(String[] args){
//         Constructor c=new Constructor(50);
//         System.out.println(c.x);
//     }
// }


public class Constructor {
    int ModelYear;
    String ModelName;

    public Constructor(int year, String name){
        ModelYear = year;
        ModelName = name;
    }

    public static void main(String[] args) {
        Constructor c = new Constructor(2022,"Odi");
        System.out.println("Model year: " + c.ModelYear + ", Model Name: " + c.ModelName);
    }
}