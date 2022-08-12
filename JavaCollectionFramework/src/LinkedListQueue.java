import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListQueue {

    public  static  void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(23);
        queue.offer(15);
        queue.offer(29);// we can also use add() but it will create an exception if it can't add this element but offer doesnot throw any exception
      //  System.out.println(queue);

       // queue.poll();//remove from front
       // System.out.println(queue);
        // System.out.println(queue.poll());
        // System.out.println(queue.peek());

        Queue<Integer> priorityQueue = new PriorityQueue<>();//normally min heap
      //  Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.offer(23);
        priorityQueue.offer(4);
        priorityQueue.offer(67);
        priorityQueue.offer(21);
        priorityQueue.offer(27);

        System.out.println(priorityQueue);// 4 21 67 23 27---> first smallest element
        priorityQueue.poll();
        System.out.println(priorityQueue);//21 23 67 27
        priorityQueue.poll();
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());








    }
}
