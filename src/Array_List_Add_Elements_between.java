import java.util.ArrayList;

public class Array_List_Add_Elements_between {
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
//add elements between
        List.add(1,1);
        System.out.println(List);
    }
}
