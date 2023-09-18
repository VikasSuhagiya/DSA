package Dsa2_Matrix;

public class M1_Print_a_matrix {
    public static void main(String[] args) {
        //1.Print a matrix
       int matrix[][]={{1,2,3},
                       {4,5,6},
                       {7,8,9}};
       int r=matrix.length;
       int c=matrix[0].length;

       for (int i=0;i<r;i++){
           for (int j=0;j<c;j++){
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
       }
    }
}
