package Dsa4_String;

public class L1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String[] s1 = {"ab", "c"};
        String[] s2 = {"a", "bc"};
        String a=" ",b=" ";

        for (int i=0;i<s1.length;i++){
            a+=s1;
        }
        for (int j=0;j<s1.length;j++){
            b+=s2;
        }
        if (a.equals(b)){
            System.out.println("False");
        }else {
            System.out.println("True");
        }
    }
}
