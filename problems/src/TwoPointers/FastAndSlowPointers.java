package TwoPointers;

import java.util.Arrays;

public class FastAndSlowPointers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(movement(new int[]{0, 1, 0, 3, 12})));
    }
   static int []  movement(int[] arr) {
        int slow=0;


        for(int fast=0;fast<arr.length;fast++) {

            if(arr[fast]!=0) {
                int temp = arr[fast];
                arr[fast]=arr[slow];
                arr[slow]=temp;
                slow++;
            }


        }
        return arr;
    }
}
