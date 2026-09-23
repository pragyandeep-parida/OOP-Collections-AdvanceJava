package LibraryManagementOOP;

import java.util.ArrayList;

public class libraryMain
{
    public static void main(String[] args)
    {
        Book b1 = new Book(1,"Java Book","James",false);
        Book b2 = new Book(2,"Java Backend","alex", true);

        Magzine m1 = new Magzine(101,10,"Tech in world");
        Magzine m2 = new Magzine(102,11,"Ai changing the world");

        ArrayList<libraryItem> list = new ArrayList<>();

        list.add(b1);
        list.add(b2);
        list.add(m1);
        list.add(m2);

        for (int i = 0; i < list.size(); i++)
        {
            list.get(i).displayInfo();
            System.out.println();
        }

        libraryItem.showTotalitems();
    }
}
