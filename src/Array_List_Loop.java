import java.util.ArrayList;

public class Array_List_Loop {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<Integer>();

        //add elements

        List.add(0);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        System.out.println(List);

        //size
        int size=List.size();
        System.out.println(size);

        //loop
        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i));
        }
        System.out.println();
    }
}
