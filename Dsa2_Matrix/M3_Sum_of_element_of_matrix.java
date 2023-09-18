package Dsa2_Matrix;

public class M3_Sum_of_element_of_matrix {
    public static void main(String[] args) {
        //3. Sum of element of matrix
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int sum=0;
        int r= matrix.length;
        int c= matrix[0].length;

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                sum=sum+matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
