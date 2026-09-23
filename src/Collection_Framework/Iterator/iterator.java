package Collection_Framework.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (int i = 0; i < list.size();i++)            // for loop
        {
            System.out.println("The element is: " + list.get(i));
        }

        for (Integer element : list)                     // for each loop
        {
            System.out.println("The element is : " + element);
        }

        Iterator<Integer> it = list.iterator();     // iterator loop

        while (it.hasNext())        //it is used to traverse one element by one elemenet
        {
            System.out.println("Iterator: " + it.next());
        }

        while(it.hasNext())                 // this is for remove() method check chatgpt properly to know how its used
        {
            int val = it.next();

            if(val == 20)
            {
                it.remove(); // safe removal
            }
            else
            {
                System.out.println("Iterator: " + val);
            }
        }
    }
}
