package Collection_Framework.Set;

import java.util.HashSet;
import java.util.Set;

public class HashExample
{
    public static void main(String[] args)
    {
        Set<Student> set = new HashSet<>();

        set.add(new Student(1,"Anuj"));
        set.add(new Student(2,"Sakti"));
        set.add(new Student(3,"Ronaldo"));
        set.add(new Student(2,"Voldemort"));

        System.out.println(set);
    }
}
