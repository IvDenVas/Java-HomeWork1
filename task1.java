import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.err.println("Введите число N: ");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        iScanner.close();

        int res = 0;
        int res2 = 1;

        while (n > 0) {
            res += n;
            res2 *= n;
            n--;
        }
        System.out.printf("n-ое треугольное число равно: %s", res);
        System.out.println();
        System.out.printf("n! равно: %s",res2);
    }
}
