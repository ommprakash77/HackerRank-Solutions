import java.util.*;

public class Vowel_or_Not {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);

            // code here
            boolean omm=(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||
                    ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
            System.out.println(omm);
        }
    }


