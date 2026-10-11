import java.util.Scanner;

public class SumOfNum {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(recSum(n));

    }
    public static int recSum(int n) {
        if(n==0) {
            return 0;
        }
        else {

            return n+recSum(n-1);

        }
    }
}
