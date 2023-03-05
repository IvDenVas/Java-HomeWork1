import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        // System.err.println("Введите первое число: ");
        Scanner iScanner = new Scanner(System.in);
        // Integer firstNum = iScanner.nextInt();
        // System.err.println("Введите логический оператор: ");
        // String logOperator = iScanner.next();
        // System.err.println("Введите второе число: ");
        // Integer secondNum = iScanner.nextInt();
        String str = iScanner.nextLine();
        iScanner.close();
        System.out.println(str);
        System.out.println(str.split(" "));


    }

}