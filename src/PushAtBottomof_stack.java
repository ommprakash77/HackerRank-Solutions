import java.util.*;

public class PushAtBottomof_stack {
    public static void pushAtBottom(int data, Stack<Integer> S) {

        if (S.isEmpty()) {
            S.push(data);
            return;
        }

        int top = S.pop();
        pushAtBottom(data, S);
        S.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);

        pushAtBottom(4, S);

        while (!S.isEmpty()) {
            System.out.println(S.peek());
            S.pop();
        }
    }

}