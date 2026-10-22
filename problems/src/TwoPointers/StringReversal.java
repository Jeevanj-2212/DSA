package TwoPointers;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();


        System.out.println(palindrome(s.toLowerCase()));
    }
   static boolean palindrome(String s) {
        int left=0;
        int right= s.length()-1;

       while(left<right) {
           if (!Character.isLetterOrDigit(s.charAt(left))) {
               left++;
               continue;
           }
           if (!Character.isLetterOrDigit(s.charAt(right))) {
               right--;
               continue;
           }
           if(s.charAt(left)!=s.charAt(right)) {
               return false;
           }
           left++;
           right--;
       }
        return true;
    }
}
