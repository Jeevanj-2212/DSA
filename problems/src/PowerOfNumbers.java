import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        int n = new Scanner(System.in).nextInt();
        System.out.println(powerOfNumber(x,n));

    }

    public static int powerOfNumber(int x,int n) {
        if (n == 0 || (n>0 &&x == 0))  {
            return 1;
        }
        return x*powerOfNumber(x,n-1);
    }
}
