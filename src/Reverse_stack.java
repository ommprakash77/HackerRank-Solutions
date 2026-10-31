import java.util.*;

public class Reverse_stack {
public static void pushAtBottom(int data,Stack<Integer>S){

    if(S.isEmpty()){
        S.push(data);
    }

    int top=S.pop();
    pushAtBottom(data,S);
    S.push(top);
}
public static void reverse(Stack<Integer>S){
    if(S.isEmpty()){
        return;

    }

    int top=S.pop();
    reverse(S);
    pushAtBottom(top,S);

}
    public static void main(String[] args) {
        Stack<Integer>S=new Stack<>();
        S.push(2);
        S.push(1);
        S.push(3);

        reverse(S);

        while(!S.isEmpty()){
            System.out.println(S.peek());
            S.pop();
        }
    }
}
