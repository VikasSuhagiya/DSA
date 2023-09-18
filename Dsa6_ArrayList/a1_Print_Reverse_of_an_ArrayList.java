package Dsa6_ArrayList;

import java.util.ArrayList;

public class a1_Print_Reverse_of_an_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> rev =new ArrayList<>();
        rev.add(1);
        rev.add(2);
        rev.add(3);
        rev.add(4);
        rev.add(5);

        for (int i =rev.size()-1; i >=0 ; i--) {
            System.out.print(rev.get(i)+" ");
        }
        System.out.println();
    }
}
