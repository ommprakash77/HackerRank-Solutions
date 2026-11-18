import java.util.*;
public class LastDigit_Number {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number:");
            int n = sc.nextInt();

            // code here
            n=n%10;
            System.out.print(Math.abs(n));
        }
    }



