package Dsa2_Matrix;

public class M11_Delete_max_element_from_each_row {
    public static void main(String[] args) {
        //11.Delete max element from each row
        int matrix[][]={
                {50,1,2,3},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int r= matrix.length;
        int c=matrix[0].length;
        int r1=0,c1=0;


        for (int i = 0; i <r ; i++) {
            int maxindex=0;
            for (int j = 0; j <c ; j++) {
                if (matrix[i][j]>maxindex){
                    maxindex=matrix[i][j];
                    r1=i;
                    c1=j;
                }
            }
            for (int k =c1; k <c-1 ; k++) {
                matrix[r1][k]=matrix[r1][k+1];
            }
        }

        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c-1 ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

//        for (int i=0;i<r;i++){
//            int maxIndex=0;
//            for (int j=0;j<c;j++){
//                if (matrix[i][j]>maxIndex){
//                    maxIndex=matrix[i][j];
//                    r1=i;
//                    c1=j;
//                }
//            }
//            for (int k=c1;k<c-1;k++){
//                matrix[r1][k]=matrix[r1][k+1];
//            }
//        }
//        for (int i=0;i<r;i++){
//            for (int j=0;j<c-1;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
