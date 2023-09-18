package Dsa6_ArrayList;
import java.util.ArrayList;
public class a3_Find_Minimum_in_an_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int min=Integer.MAX_VALUE;


        //First method
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)<min){
                min=list.get(i);
            }
        }
        System.out.println(min);


        //Second method
//        for (int i = 0; i <list.size() ; i++) {
//            min=Math.min(min,list.get(i));
//        }
//        System.out.println(min);
    }
}
