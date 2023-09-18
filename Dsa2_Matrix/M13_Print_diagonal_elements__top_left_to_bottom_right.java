package Dsa2_Matrix;

public class M13_Print_diagonal_elements__top_left_to_bottom_right {
    public static void main(String[] args) {
        //13.Print diagonal elements (top-left to bottom-right)
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int r= matrix.length;
        int c= matrix[0].length;

        int j=c-1;
        for (int i = 0; i <r ; i++) {
            System.out.print(matrix[i][j]+" ");
            j--;
        }
    }
}
