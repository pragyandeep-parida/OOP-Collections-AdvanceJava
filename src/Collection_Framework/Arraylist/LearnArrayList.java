package Collection_Framework.Arraylist;
import java.util.ArrayList;
import java.util.List;

public class LearnArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);           //it will add 50 to the end
        System.out.println(list);

        list.add(1,11);     // we can also insert a new number to spcific index of our choice using .add(index,element)
        System.out.println(list);

        List<Integer> NewList = new ArrayList<>();
        NewList.add(160);
        NewList.add(170);

        list.addAll(NewList);      //we can add 2 lists also using addAll
        System.out.println(list);

        System.out.println(list.get(3));   // gets the element in 3rd index

        list.remove(4);             //removes the element from 4th index see 40 is removed
        System.out.println(list);

        list.remove(Integer.valueOf(170));     //specifically removes that integer value from the arraylist
        System.out.println(list);

//        list.clear();           //deletes or clears the entire list
//        System.out.println(list);

        list.set(2,1000);    //sets the index 2 1000
        System.out.println(list);

        System.out.println(list.contains(50));  //.contains() checks if a number is present inside the list or not

    }
}
