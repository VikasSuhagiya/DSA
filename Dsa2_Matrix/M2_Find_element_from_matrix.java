package Dsa2_Matrix;

public class M2_Find_element_from_matrix {
    public static void main(String[] args) {
        //2. Find element from matrix
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int element=5;
        int r= matrix.length;
        int c= matrix[0].length;

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (matrix[i][j]==element){
                    System.out.println("Value present");
                    return;
                }
            }
        }
        System.out.println("Value not present");
    }
}
