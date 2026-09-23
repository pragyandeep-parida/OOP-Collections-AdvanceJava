package Collection_Framework.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionclass
{
    public static void main(String[] args)
    {
        List<Integer> num = new ArrayList<>();

        num.add(12);
        num.add(67);
        num.add(54);
        num.add(34);
        num.add(76);
        num.add(23);
        num.add(28);

        System.out.println("The Smallest element is: " + Collections.min(num));

        System.out.println("The Largest element is: " + Collections.max(num));

        System.out.println(Collections.frequency(num,54));  // checks hoe many times a number is repeated

        Collections.sort(num, Comparator.reverseOrder());  // or simply num.reversed will also work
        System.out.println(num);

    }
}
