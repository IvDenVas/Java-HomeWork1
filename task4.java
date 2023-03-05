public class task4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + j * 10 + 5 == 69 & i == j) {
                    count++;
                    System.out.println("2" + i + " + " + j + "5" + " = 69");
                }
            }
        }
        if (count == 0) {
            System.out.println("Решений нет!");
        }
    }
}
