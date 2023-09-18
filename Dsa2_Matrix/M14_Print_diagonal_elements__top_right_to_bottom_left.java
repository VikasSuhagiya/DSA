package Dsa2_Matrix;
public class M14_Print_diagonal_elements__top_right_to_bottom_left {
    public static void main(String[] args) {
        //14.Print diagonal elements (top-right to bottom-left)
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int r= matrix.length;
        int c= matrix[0].length;

        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                if (i==j){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
}
