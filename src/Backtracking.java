import java.util.*;

public class Backtracking {
    public static void printpermutation(String str,String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return ;
        }

        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printpermutation(newstr,perm+currchar,idx+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        printpermutation(str," ",0);
    }
}
