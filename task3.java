import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.err.println("Введите выражение через пробелы: ");
        String inputUser = iScanner.nextLine();
        iScanner.close();

        String[] words = inputUser.split(" ");
        int x = Integer.parseInt(words[0]);
        int y = Integer.parseInt(words[2]);

        switch (words[1]) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println("Неверный ввод!");
        }
    }
}