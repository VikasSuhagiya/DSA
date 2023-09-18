package Dsa9_HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class H4_Most_frequent_element_in_an_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,1,1,1,2,3};
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else {
                hashMap.put(arr[i],1);
            }
        }
        System.out.println(hashMap);

        int max = Integer.MIN_VALUE;
        int ans=-1;

        for (Map.Entry me : hashMap.entrySet()){
            if ((int)me.getValue()>max){
                max = (int) me.getValue();
                ans = (int) me.getKey();
            }
        }
        System.out.println("Most frequent element is :"+ ans);
    }
}
