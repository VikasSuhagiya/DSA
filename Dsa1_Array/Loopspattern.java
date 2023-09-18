public class Loopspattern {
    public static void main(String[] args) {
        //6.
        /*
        int n=5;
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        OUTPUT:
        *****
        ****
        ***
        **
        *

         */

        //5.
        /*
       int n=5;
       for (int i=1;i<=n;i++){
           for (int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for (int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       OUTPUT:
           *
          **
         ***
        ****
       *****
         */


        //4.
        /*
        int n=5;

        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        OUTPUT:
        *****
        ****
        ***
        **
        *
         */





        //3.half rectangle
        /*
        int n=5;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        OUTPUT:
        *
        **
        ***
        ****
        *****
        */



        //2.Hollow rectangle
        /*
        int a=4;
        int b=5;

        for (int i=1;i<=a;i++){
            for (int j=1;j<=b;j++){
                if (i==1||i==a||j==1||j==b){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        OUTPUT:
        *****
        *   *
        *   *
        *****
         */




        //1.rectangle
        /*
        int a=4;
        int b=5;

        for (int i=1;i<=a;i++){
            for (int j=1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        OUTPUT:
        *****
        *****
        *****
        *****
         */
    }
}
