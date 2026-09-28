import java.util.*;

public class LogicalQuestion26 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x > 0) {
                    System.out.println(x + " → Positive");
                } else if (x < 0) {
                    System.out.println(x + " → Negative");
                } else {
                    System.out.println(x + " → Zero");
                }
            }
        }
    }
