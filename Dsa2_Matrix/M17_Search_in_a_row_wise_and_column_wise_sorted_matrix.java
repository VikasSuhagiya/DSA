package Dsa2_Matrix;

public class M17_Search_in_a_row_wise_and_column_wise_sorted_matrix {
    public static void main(String[] args) {
        //17.Search in a row wise and column wise sorted matrix
        int mat[][]={{1,2,3},
                     {5,6,7},
                     {9,10,11},
                     {13,14,15}};
        int val= 5;
        int row= mat.length;
        int col= mat[0].length;
        int r=0,c=col-1;

        while (c>=0 && r<=row-1){
            if (val == mat[r][c]){
                System.out.println("value is present");
                return;
            } else if (val<mat[r][c]) {
                c--;
            }else {
                r++;
            }
        }
        System.out.println("value is not present");
    }
}
