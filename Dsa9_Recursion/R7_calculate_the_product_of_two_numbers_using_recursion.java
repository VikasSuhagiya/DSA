package Dsa9_Recursion;

public class R7_calculate_the_product_of_two_numbers_using_recursion {
    public static void main(String[] args) {
        System.out.println(product(5,8));
    }

    public static int product(int x, int y) {
        if(y == 1) {
            return x;
        }
        return x + product(x, y-1);
    }
}
