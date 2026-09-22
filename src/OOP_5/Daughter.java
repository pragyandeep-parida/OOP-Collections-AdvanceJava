package OOP_5;

public class Daughter extends Parent
{
    public Daughter(int age)
    {
        this.age = age;
    }

    @Override
    void career()
    {
        System.out.println("i am going to be a doctor");
    }

    @Override
    void partner()
    {
        System.out.println("I dont love anyone");
    }
}
