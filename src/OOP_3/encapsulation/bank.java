package OOP_3.encapsulation;

public class bank                       //this is a class
{
    private int bankbalance = 100000;

    //setter
    public int setbalance(int b)        //this is a method
    {
        bankbalance = b;
        return b;
    }

    //getter
    public int getbalance()             //this is a method
    {
        return bankbalance;
    }
}
