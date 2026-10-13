import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(sumDeg(n));
    }
    public static int sumDeg(int n) {
        int sum =0;
        if(n==0) {
            return 0;
        }
        return n%10+sumDeg(n/10);
    }
}
