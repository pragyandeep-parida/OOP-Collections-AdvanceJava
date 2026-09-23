package Collection_Framework.Set;

import java.util.Set;

public class TreeSet
{
    public static void main(String[] args)
    {
        Set<Integer> set = new java.util.TreeSet<>();

        set.add(10);
        set.add(15);
        set.add(17);
        set.add(14);
        set.add(16);

        System.out.println(set);  // 🔴👉In TreeSet the integers always come in sorted format like from ascending to descending and use Comparator.Reverseorder the reverse the set

        set.remove(15);    // removes the specific integer
        System.out.println(set);

        System.out.println(set.contains(17));   // checks if the set contains 17 or not

        System.out.println(set.isEmpty());   // checks if the set is empty or not

        System.out.println(set.size());      // returns the size of the set

        set.clear();    // clears the set
        System.out.println(set);
    }
}
