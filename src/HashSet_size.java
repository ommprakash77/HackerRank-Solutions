import java.util.HashSet;

public class HashSet_size {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);

        //search contains
        if (set.contains(1)) {
            System.out.println("set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("does not contains");

            System.out.println("size of the set:"+set.size());
        }
    }
}