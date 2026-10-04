

import java.util.*;

public class PatternQuestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number n:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            for(int j = 1; j < i; j++){
                System.out.print("  ");
            }

            for(int j = i; j <= n; j++){
                System.out.print("x ");
            }

            System.out.println();
        }
    }
}