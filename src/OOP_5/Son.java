package OOP_5;

public class Son extends Parent
{
    public Son(int age)
    {
        this.age = age;
    }

    @Override
    void normal()
    {
        super.normal();
    }

    @Override
    void career()
    {
        System.out.println("i am going to be a software developer");
    }

    @Override
    void partner()
    {
        System.out.println("I love Sydney Sweeney");
    }
}
