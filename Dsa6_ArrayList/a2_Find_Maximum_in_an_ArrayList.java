package Dsa6_ArrayList;

import java.util.ArrayList;

public class a2_Find_Maximum_in_an_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(9);
        list.add(7);
        int max=Integer.MIN_VALUE;

        //First Method
//        for (int i = 0; i <list.size() ; i++) {
//            if (list.get(i)>max){
//                max=list.get(i);
//            }
//        }
//        System.out.println("Max element is:-"+max);


        //Second Method
        for (int i = 0; i <list.size() ; i++) {
            max=Math.max(max,list.get(i));
        }
        System.out.println("Max Element is:-"+max);








    }
}
