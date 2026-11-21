import java.util.*;

public class Function_With_return {

        int returnValueFunction(int n) {
            // code here
            int product=2*n;
            return product;
        }
        public static void main(String[]arg){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Function_With_return obj=new Function_With_return();
            System.out.println(obj.returnValueFunction(n));
        }
    }
