
public class task2 {
    public static void main(String[] args) {
        boolean bool;
        for (int i = 2; i < 1000; i++) {
            bool = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    bool = false;
                }
            }
            if (bool) {
                System.out.println(i);
            }
        }
    }
}
