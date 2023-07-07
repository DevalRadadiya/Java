public class Array {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,8,9,10};

        System.out.println(array.length);
        System.out.println(array[6]);
        
        for (int i=1;i<array.length;i++) {
            System.out.println(i);
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
