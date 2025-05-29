package Collection;

import java.util.*;

public class ListTypes {
    public static void main(String[] args) {
        //List
        List<Integer> ll =  new ArrayList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.add(4);

        System.out.println("List " +ll);

        //LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Amritesh");
        linkedList.add("Suraj");
        linkedList.add("abhi");
        linkedList.add(2,"Diptee");
        System.out.println("linkedList "+linkedList);
        linkedList.clear();
        System.out.println("linkedList "+linkedList);

        //Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(3);
        vector.add(4);
        System.out.println("Vector "+vector);
        Boolean b = vector.contains(5);
        System.out.println("vector contains "+b);

        //Stack - LIFO
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.push(5);
        System.out.println("Stack "+stack);
        stack.pop();
        System.out.println("Stack after pop "+stack);
    }
}
