public class MultiDimentional {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3,4,5},{6,7,8,9,10}};
        for (int i=0; i<matrix.length; i++) {
            System.out.print("\n");
            for (int j=0; j<matrix[i].length; j++) {
                
                System.out.print(" "+matrix[i][j]);

            }
        /*int[][] matrix= {{1,2,3,4,5},{6,7,8,9,10}};
        System.out.println(matrix[0][3]); */
        }
    }
}
