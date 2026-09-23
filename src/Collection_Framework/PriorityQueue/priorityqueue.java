package Collection_Framework.PriorityQueue;

import java.util.PriorityQueue;

public class priorityqueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();     // you can use comparator to reverse the order Comparator.reverseorder(), Use of collections.reverseorder is also possible

        pq.offer(32);
        pq.offer(11);               // in priorityqueue there is internal working of MINHEAP means the numbers are arranged in ascending if we use comparaator we can reverse the order
        pq.offer(43);
        pq.offer(54);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

    }
}
