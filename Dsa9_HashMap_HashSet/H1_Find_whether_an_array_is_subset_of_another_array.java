package Dsa9_HashMap_HashSet;

import java.util.HashSet;

public class H1_Find_whether_an_array_is_subset_of_another_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};     //subset means arr ma hoi te value arr2 ma pan hoi
        int arr2[] = {1,2,7,6};

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i< arr.length;i++){
            hashSet.add(arr[i]);
        }
        for (int j = 0; j <arr2.length ; j++) {
            if (!hashSet.contains(arr2[j])){
                System.out.println("Not subset");
                return;
            }
        }
        System.out.println("Subset");
    }
}
