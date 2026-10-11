import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        printFun(n);
    }

    public static void printFun(int n) {
        if(n==0) {
            return ;
        }
        else {

            printFun(n-1);
            System.out.println(n);
        }

    }
}
