package Collection;

import java.util.*;

public class QueueType {
    public static void main(String[] args) {
        //Queue - FIFO
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        queue.offer(3);
        queue.add(4);
        System.out.println("Queue "+queue);

        //Dequeue and ArrayDequeue

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        System.out.println("dequeue "+deque);
        deque.addFirst(5);
        System.out.println("Dequeue addfirst "+deque);
        deque.poll();
        System.out.println("Dequeue poll "+deque);
        deque.removeLast();
        System.out.println("Dequeue remove last "+deque);

        //PriorityQueue - minimum value on top
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.offer(8);
        priorityQueue.offer(6);
        priorityQueue.add(4);
        priorityQueue.add(7);
        priorityQueue.add(10);
        System.out.println("Priority Queue "+priorityQueue);
        System.out.println("Priority Queue after poll "+priorityQueue.poll());
        System.out.println("Priority Queue after poll "+priorityQueue.poll());
        System.out.println("Priority Queue after poll "+priorityQueue.poll());

        //priorityQueue - maximum value on top

        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue1.add(1);
        priorityQueue1.offer(8);
        priorityQueue1.offer(6);
        priorityQueue1.add(4);
        priorityQueue1.add(7);
        priorityQueue1.add(10);

        System.out.println("priorityQueue1 maximum"+priorityQueue1);
        System.out.println("priorityQueue1 maximum delete "+priorityQueue1.poll());
        System.out.println("priorityQueue1 maximum delete "+priorityQueue1.poll());
    }
}
