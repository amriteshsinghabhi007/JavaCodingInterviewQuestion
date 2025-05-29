package Collection;

import java.util.*;

public class SetTypes {
    public static void main(String[] args) {

        //Set
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        System.out.println("Set "+set);
        System.out.println("Set size"+set.size());
        set.remove(3);
        System.out.println("Removing object "+set);

        //hashSet
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(3);
        hashSet.add(4);
        System.out.println("hash Set " +hashSet);
        hashSet.clear();
        System.out.println("clear all hash set "+hashSet);

        //LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        System.out.println("linkedhashSet "+linkedHashSet);

        //TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("AmriteshSingh");
        treeSet.add("SurajSingh");
        treeSet.add("AbhishekSinghRajput");
        treeSet.add("AmriteshSingh");
        System.out.println("TreeSet "+treeSet);
    }
}
