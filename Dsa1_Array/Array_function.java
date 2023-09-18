package Dsa1_Array;

public class Array_function {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int p=0;

        p=insert(arr,p,10);
        p=insert(arr,p,20);
        p=insert(arr,p,30);
        p=insert(arr,p,40);
        p=insert(arr,p,50);
        find(arr,p,30);
        update(arr,40,400,p);
        p=delete(arr,p,30);
        print(arr,p);


    }
    public static int insert(int arr[],int p,int value){
        if (p== arr.length){
            System.out.println("array is full");
            return p;
        }

            arr[p]=value;
            p++;
            return p;
    }

    public static void print(int arr[],int p){
        for (int i=0;i<p;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void find(int arr[],int p,int value){
        for (int i=0;i<p;i++){
            if (arr[i]==value){
                System.out.println("value is present");
            }else {
                System.out.println("Value not present");
            }
        }
    }

    public static void update(int arr[],int oldv,int newv,int p){
        for (int i=0;i<p;i++){
            if (arr[i]==oldv){
                arr[i]=newv;
            }
        }
    }

    public static int delete(int arr[],int p,int value){
        for (int i=0;i<p;i++){
            if (arr[i]==value){
                for (int j=i;j<p-1;j++){
                    arr[j]=arr[j+1];
                }
            }
        }
        p--;
        return p;
    }



}