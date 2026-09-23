package Collection_Framework.QueueLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class queuelinkedlist
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        {
            queue.offer(1);
            queue.offer(2);
            queue.offer(3);
            queue.offer(4);

            System.out.println(queue);    // 1 2 3 4 will be printed

            queue.poll();                   //deletes the first element so the first element is 1 will be deleted
            System.out.println(queue);      // 2 3 4 is the left over number

            queue.offer(5);
            System.out.println(queue);      //now in queue the number is added from the back

            System.out.println(queue.peek());   // peek it will show the first element
        }
    }
}
