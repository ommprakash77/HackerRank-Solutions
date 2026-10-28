import java.util.HashSet;

public class Hashset_add {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);

    }
}
