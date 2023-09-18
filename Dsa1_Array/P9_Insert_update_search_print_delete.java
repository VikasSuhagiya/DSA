package Dsa1_Array;

public class P9_Insert_update_search_print_delete {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int p = 0;

        p = insert(arr, p, 10);
        p = insert(arr, p, 20);
        p = insert(arr, p, 30);
        p = insert(arr, p, 40);
        p = insert(arr, p, 50);
        update(arr, p, 30, 300);
        find(arr, p, 300);
        p=delete(arr,p,300);
        print(arr, p);

    }

    private static int insert(int arr[], int p, int value) {
        if (p == arr.length) {
            System.out.println("Array us full");
            return p;
        }
        arr[p] = value;
        p++;
        return p;
    }

    private static void print(int arr[], int p) {
        for (int i = 0; i < p; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void update(int arr[], int p, int oldv, int newv) {
        for (int i = 0; i < p; i++) {
            if (arr[i] == oldv) {
                arr[i] = newv;
            }
        }
    }

    private static void find(int arr[], int p, int value) {
        for (int i = 0; i < p; i++) {
            if (arr[i] == value) {
                System.out.println("Value is present");
            }
            System.out.println("Value is not present");
        }
    }

    private static int delete(int arr[], int p, int value) {
        for (int i = 0; i < p; i++) {
            if (arr[i]==value){
                for (int j = i; j <p-1; j++) {
                    arr[j] = arr[j+1];
                }
            }

        }
        p--;
        return p;
    }


}