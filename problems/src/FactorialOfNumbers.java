import java.util.Scanner;

public class FactorialOfNumbers {
    public static void main(String[] args) {
        int n  = new Scanner(System.in).nextInt();
        System.out.println(n < 0 ? "Negative number Factorial is undefined" : fact(n));

    }

    public static int fact(int n) {
        if(n<=1) {
            return 1;
        }
        return n*fact(n-1);
    }
}
