import java.util.*;
public class PatternQuestion7 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter n:");
            int n = sc.nextInt();

            // Upper half
            for (int i = 1; i <= n; i++) {

                // Left side x
                for (int j = 1; j <= i; j++) {
                    System.out.print("x ");
                }
                // Middle spaces
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print("  ");
                }

                // Right side x
                for (int j = 1; j <= i; j++) {
                    System.out.print("x ");
                }

                System.out.println();
            }

            // Lower half
            for (int i = n; i >= 1; i--) {

                // Left side x
                for (int j = 1; j <= i; j++) {
                    System.out.print("x ");
                }

                // Middle spaces
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print("  ");
                }

                // Right side x
                for (int j = 1; j <= i; j++) {
                    System.out.print("x ");
                }

                System.out.println();
            }
        }
    }

