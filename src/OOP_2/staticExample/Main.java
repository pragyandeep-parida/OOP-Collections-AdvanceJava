package OOP_2.staticExample;

public class Main
{
    public static void main(String[] args)
    {

    }
    static void fun()
    {
        //greeting();         //this wont work as greeting does not have a static method

        Main obj = new Main();      // here i am referencing it, THAT'S WHY greeting() is  WORKING
        obj.greeting();             // here it will work as you cannot access non-static stuff without referencing their insttances in static context
    }
    void greeting()         //if you do static void greeting(), then the greeting would work
    {
        System.out.println("hello");
    }
}
