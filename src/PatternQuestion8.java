public class PatternQuestion8 {
        public static void main(String[] args) {
            int n = 5;

            for (int i = 1; i <= n; i++) {

                // Left spaces
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }

                // X and inner spaces
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i || i == n) {
                        System.out.print("x ");
                    } else {
                        System.out.print("  ");
                    }
                }

                System.out.println();
            }
        }
    }

