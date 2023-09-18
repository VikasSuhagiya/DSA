package Dsa2_Matrix;

public class M16_Find_element_from_sorted_matrix {
    public static void main(String[] args) {
        //16.Find element from sorted matrix : Binary search: solution log(row) + log(column)
        int mat[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        int val= 5;
        int row= mat.length;
        int col= mat[0].length;
        int top=0,bottom=row-1;
        int rowtobesearched=-1;

        while (top <= bottom){
            int mid=(top + bottom)/2;
            if (mat[mid][0] <= val && mat[mid][col-1] >= val ){
                rowtobesearched=mid;
                break;
            } else if (val<mat[mid][0]) {
                bottom=mid-1;
            }
            else {
                top=mid+1;
            }
        }
        if (rowtobesearched == -1){
            System.out.println("value not present");
            return;
        }
        int left=0,right=col-1;

        while (left<=right) {
            int mid = (left + right) / 2;
            if (mat[rowtobesearched][mid] == val) {
                System.out.println("value is present");
                return;
            } else if (mat[rowtobesearched][mid] < val) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("value not present");


    }
}
