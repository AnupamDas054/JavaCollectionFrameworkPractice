import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDeckFunctionality {
    public static void main(String[] arg)
    {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(12);
        arrayDeque.offer(34);
        System.out.println(arrayDeque);

        arrayDeque.offerFirst(23);
        arrayDeque.offerLast(54);
        System.out.println(arrayDeque);

//        arrayDeque.pollFirst();
//        System.out.println(arrayDeque);
        arrayDeque.poll();
        System.out.println(arrayDeque);
        arrayDeque.pollLast();
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekLast());
        System.out.println(arrayDeque);

    }
}
