import java.util.*;

public class LL_CollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<String>();

        List.add("is");
        List.add("a");
        List.add("List");

        List.addFirst("This");
        System.out.println(List);

        List.add(3,"LinkedList");
        System.out.println(List);

        List.addLast("a");
        System.out.println(List);

        System.out.println(List.get(0));

        List.removeLast();
        System.out.println(List);
    }
}
