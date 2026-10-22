import java.util.ArrayList;

public class Array_List_Size {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<Integer>();

        //add elements
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);

        System.out.println(List);

        //size

        int size=List.size();
        System.out.println(size);
    }
}
