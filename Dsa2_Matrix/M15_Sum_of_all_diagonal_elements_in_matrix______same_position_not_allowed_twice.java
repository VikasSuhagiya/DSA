package Dsa2_Matrix;

public class M15_Sum_of_all_diagonal_elements_in_matrix______same_position_not_allowed_twice {
    public static void main(String[] args) {
        //15.Sum of all diagonal elements in matrix (same position not allowed twice)
        int mat[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};                         //1+5+9+3+7=25
        int row = mat.length;
        int col = mat[0].length;

        int sum=0;
        for (int i=0;i<row;i++){
            sum += mat[i][i];
            if (i!= col-1-i){
                sum += mat[i][col-i-1];
            }
        }
        System.out.println(sum);
    }
}
