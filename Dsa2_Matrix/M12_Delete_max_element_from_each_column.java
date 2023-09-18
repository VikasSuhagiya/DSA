package Dsa2_Matrix;

public class M12_Delete_max_element_from_each_column {
    public static void main(String[] args) {
        //12.Delete max element from each column
        int matrix[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int r= matrix.length;
        int c=matrix[0].length;
        int r1=0,c1=0;

        for (int i=0;i<c;i++){
            int max=0;
            for (int j=0;j<r;j++){
                if (matrix[j][i]>max){
                    max=matrix[j][i];
                    c1=i;
                    r1=j;
                }
            }
            for (int k=r1;k<r-1;k++){
                matrix[k][c1]=matrix[k+1][c1];
            }
        }
        for (int i=0;i<r-1;i++){
            for (int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
