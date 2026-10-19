import java.util.ArrayList;

public class Array_List_get_elements {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<Integer>();

        //add elements
        List.add(0);
        List.add(2);
        List.add(3);

        System.out.println(List);

        int elements=List.get(1);
        System.out.println(elements);

    }
}
