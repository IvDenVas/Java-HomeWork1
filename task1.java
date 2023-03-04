import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.err.println("Введите число N: ");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        iScanner.close();

        int res = 0;

        while (n >= 0) {
            res = res + n;
            n--;
        }
        System.out.println(res);
    }
}
