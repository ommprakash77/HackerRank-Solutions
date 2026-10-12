public class PatternQuestion8 {
        public static void main(String[] args) {
            int n = 4;

            // Upper half
            for (int i = 1; i <= n; i++) {

                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }

            // Lower half
            for (int i = n - 1; i >= 1; i--) {

                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }
    }

