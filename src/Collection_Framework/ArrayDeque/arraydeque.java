package Collection_Framework.ArrayDeque;

import java.util.ArrayDeque;

public class arraydeque
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(15);
        adq.offerFirst(11);         // in offerFirst the element is added in the first
        adq.offerLast(18);          // in offerLast the element is added in last
        adq.offer(20);              // in Queue the elements are always added to the last so even after offerLast it is added in last

        System.out.println(adq);

        System.out.println(adq.peek());         // shows whats the first element
        System.out.println(adq.peekFirst());    //peekFirst shows the element in the beginning
        System.out.println(adq.peekLast());     //peekLast shows the element in the last

        System.out.println(adq.poll() + " it will remove the first element");
        System.out.println(adq);

        System.out.println(adq.pollFirst() + " it will remove the element at first");
        System.out.println(adq);

        System.out.println(adq.pollLast() + " it will remove the element in the last");
        System.out.println(adq);
    }
}
