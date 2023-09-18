package Dsa2_Matrix;

public class M5_Print_matrix_in_reverse_order {
    public static void main(String[] args) {
        //5.Print matrix in reverse order
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r= matrix.length;
        int c=matrix[0].length;

        for (int i=r-1;i>=0;i--){
            for (int j=c-1;j>=0;j--){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


//        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
//        int r=matrix.length;
//        int c=matrix[0].length;
//
//        for (int i=c-1;i>=0;i--){
//            for (int j=r-1;j>=0;j--){
//                System.out.print(matrix[j][i]+" ");
//            }
//            System.out.println();
//        }
    }
}
