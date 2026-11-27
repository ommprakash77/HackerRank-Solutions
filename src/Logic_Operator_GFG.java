import java.util.*;
public class Logic_Operator_GFG {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            boolean x = sc.nextBoolean();
            boolean y = sc.nextBoolean();

            // code here
            boolean p=x && y;
            boolean q=x || y;
            boolean r=!x;
            boolean s=!y;

            System.out.printf("%s %s %s %s", p ? "true" : "false", q ? "true" : "false",
                    r ? "true" : "false", s ? "true" : "false");
        }
    }