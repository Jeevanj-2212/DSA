import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(countDigit(n));
    }

    public static int countDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigit(n / 10);
    }
}