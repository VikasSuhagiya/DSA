package Dsa9_HashMap_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class hashing {
    public static void main(String[] args) {
        //HashSet
        //creating
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);



        //Print all element
        System.out.println(set);

        //Size
        System.out.println("Size of set is : "+ set.size());

        //Iterator
        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Search - contains
//        if (set.contains(1)){
//            System.out.println("Set contains 1");
//        }
//        if (!set.contains(6)){
//            System.out.println("Does not contains");
//        }

        //Delete
//        set.remove(1);
//        if (!set.contains(1)){
//            System.out.println("Does not contain 1");
//        }






        //HashMap
        /*HashMap<String ,Integer> map = new HashMap<>();
        //Insertion
        map.put("India",130);
        map.put("China",150);
        map.put("USA",40);
        map.put("Russia",14);
        System.out.println(map);

        //update
        map.put("China",180);
        System.out.println(map);

        //Search
//        if (hashmap.containsKey("indonesia")){
//            System.out.println("Key is present in the map");
//        }else {
//            System.out.println("Key is not present in the map");
//        }

        //Key exist or not
//        System.out.println(hashmap.get("India"));
//        System.out.println(hashmap.get("Indonesia"));


        //iteration in hashmap
//        int arr[] = {10,20,25};
//        for (int i = 0; i <3 ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//        for (int value:arr) {
//            System.out.print(value + " ");
//        }
//        System.out.println();



//        for (Map.Entry<String,Integer> e : map.entrySet()){
//            System.out.print(e.getKey()+"  ");
//            System.out.println(e.getValue());
//        }


        map.remove("China");
        System.out.println(map);
         */
    }
}
