package DSA12_Binary_Search_Tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Comparator1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(58);
        arrayList.add(8);
        arrayList.add(13);
        arrayList.add(6);
        arrayList.add(26);
        Collections.sort(arrayList,new NumComparator());
        System.out.println(arrayList);
    }
}
class NumComparator implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {
        String s1 = String.valueOf(o1);
        String s2 = String.valueOf(o2);
        int a = Integer.valueOf(s1+s2);
        int b = Integer.valueOf(s2+s1);
        if (a>b){
            return -11;
        }else if (a<b){
            return 1;
        }
        return 0;
    }
}
