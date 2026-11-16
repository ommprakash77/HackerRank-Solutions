import java.util.*;
public class FF_function {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String s;
            int n;
            float f;
            int ff; // To Store floor of float variable f

            s=sc.nextLine();
            n=sc.nextInt();
            f=sc.nextFloat();

            ff=(int)Math.floor(f);


            System.out.println(s);
            System.out.println(n);
            System.out.println(ff);
        }
    }
