package OOP_5.nested;

public class A
{
    public interface nestedinterface
    {
        boolean isOdd(int num);
    }
}

class B implements A.nestedinterface
{
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

