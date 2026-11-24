import java.util.*;

public class GFG_calculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int optr=sc.nextInt();

            // code here
            if (optr == 1) {
                System.out.print(a + b);
            } else if (optr == 2) {
                System.out.print(a - b);
            } else if (optr == 3) {
                System.out.print(a * b);
            }
        }
    }


