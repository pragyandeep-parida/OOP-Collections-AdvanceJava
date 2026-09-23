package Collection_Framework.Set;

import java.util.Set;

public class HashSet
{
    public static void main(String[] args)
    {
        Set<Integer> set = new java.util.HashSet<>();

        set.add(10);
        set.add(15);
        set.add(17);
        set.add(14);
        set.add(16);

        //set.add(16);   //wont work as HashSet doesnt allow duplicates

        System.out.println(set);            // 🔴👉 it prints the integers in random order as there is hashing going on inside

        set.remove(15);    // removes the specific integer
        System.out.println(set);

        System.out.println(set.contains(17));   // checks if the set contains 17 or not

        System.out.println(set.isEmpty());   // checks if the set is empty or not

        System.out.println(set.size());      // returns the size of the set

        set.clear();    // clears the set
        System.out.println(set);

    }
}
