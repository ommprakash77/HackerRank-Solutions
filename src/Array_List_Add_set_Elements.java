import java.util.ArrayList;

public class Array_List_Add_set_Elements {
    public static void main(String[] args) {

        ArrayList<Integer>List=new ArrayList<Integer>();

        //add elements
        List.add(0);
        List.add(2);
        List.add(3);

        System.out.println(List);

        //get elements

        int elements=List.get(1);
        System.out.println(elements);

        //add between elements

        List.add(1,3);
        System.out.println(List);

        //add set elements

        List.add(0,5);
        System.out.println(List);
    }
}
