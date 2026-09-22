package OOP_5;

public  abstract class Parent
{
    int age;

    static void hello()         //we can create static methods inside a parent class
    {
        System.out.println("HELLO");
    }

    void normal()
    {
        System.out.println("THIS IS A NORMAL METHOD");
    }

    abstract void career();
    abstract void partner();
}
