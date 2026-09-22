package OOP_6.comparing;

public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student(11,75.87f);
        Student s2 = new Student(16,55.82f);

        if (s1.compareTo(s2) > 0)
        {
            System.out.println("S1 is bigger");
        }
        else
        {
            System.out.println("S2 is bigger");
        }
    }
}
