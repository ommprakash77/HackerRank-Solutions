import java.util.HashSet;

public class Hashset_Delete {
    public static void main(String[] args) {
        HashSet<Integer>Set=new HashSet<>();

        Set.add(1);
        Set.add(2);
        Set.add(2);

        System.out.println(Set);

        if(Set.contains(1)){
            System.out.println("set contains(1)");

        }
        if(!Set.contains(5)){
            System.out.println("does not contains");
        }
        //delete
        Set.remove(1);
        System.out.println(Set);

        if(!Set.contains(1));
        System.out.println("does not contains 1 because i delete 1");
    }

}
