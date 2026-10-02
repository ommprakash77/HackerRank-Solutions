import java.util.Scanner;

public class patternQuestion2 {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the numbers n:");
            int n=sc.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=i;j<n;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("x"+" ");
                }
                System.out.println();
            }
        }
    }


