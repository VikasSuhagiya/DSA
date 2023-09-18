package Dsa5_Stack;

import java.util.Stack;

public class s12_Remove_All_Adjacent_Duplicates_In_String_Input_abbaca_output_ca {
    public static void main(String[] args) {

        String s = "ihahcajchcghffjdcdiebbigjdihgcibifhacddacfcchhjdeibfgchdeihiegfibbeefcjaccbdeggjgdifeibbfeihfhgddd";
        Stack<Character> stk = new Stack<>();

        for(char ch: s.toCharArray()){
            if(!stk.isEmpty() && stk.peek()==ch){
                stk.pop();
            } else{
                stk.push(ch);
            }
        }

        String ans = "";
        while(!stk.isEmpty()){
            ans = stk.pop() + ans;
        }
        System.out.print(ans);
    }
}
