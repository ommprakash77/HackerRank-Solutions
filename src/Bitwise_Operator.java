import java.util.*;

public class Bitwise_Operator {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int d=a^a;
            int e=c^b;
            int f=a&b;

            int g=~e;
            int p=-(e+1);


            System.out.println(d + " " + e + " " + f + " " + g);
        }
    }
