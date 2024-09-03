package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println("Size of set :- " + set.size());

        //search
        if (set.contains(1)) {
            System.out.println("It contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("It does not contains 6");
        }
        set.remove(1);
        System.out.println(" removed 1 from the list");
        System.out.println(set);

        //iteration
        Iterator it = set.iterator();

        while (!it.hasNext()){
            System.out.println(it.next());
        }
    }
}
