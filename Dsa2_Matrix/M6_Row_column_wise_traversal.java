package Dsa2_Matrix;

public class M6_Row_column_wise_traversal {
    public static void main(String[] args) {
        //6. Row / column wise traversal
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int r= matrix.length;
        int c= matrix[0].length;

        for (int i = 0; i <r ; i++) {                                 //Row wise
            for (int j = 0; j <c ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
        System.out.println();            //new line

        for (int i = 0; i <c ; i++) {                                 //column wise
            for (int j = 0; j <r ; j++) {
                System.out.print(matrix[j][i]+" ");
            }
        }
    }
}
