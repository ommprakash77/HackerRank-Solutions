import java.util.ArrayList;

public class Array_List_Remove_Elements {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<Integer>();

        //add elements
        List.add(0);
        List.add(2);
        List.add(3);
        List.add(4);

        System.out.println(List);

        //get elements
        int elements=List.get(2);
        System.out.println(elements);

        //in between elements
        List.add(1,1);
        System.out.println(List);

        //set elements
        List.set(0,5);
        System.out.println(List);

        //remove elements
        List.remove(0);
        System.out.println(List);
    }
}
