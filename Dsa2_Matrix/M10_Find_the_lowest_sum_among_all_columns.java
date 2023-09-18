package Dsa2_Matrix;

public class M10_Find_the_lowest_sum_among_all_columns {
    public static void main(String[] args) {
        //10.Find the lowest sum among all columns
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int min=Integer.MAX_VALUE;
        int r=matrix.length;
        int c=matrix[0].length;

        for (int i=0;i<r;i++){
            int sum=0;
            for (int j=0;j<c;j++){
                sum=sum+matrix[i][j];
            }
            if (sum<min){
                min=sum;
            }
        }
        System.out.println(min);

    }
}
