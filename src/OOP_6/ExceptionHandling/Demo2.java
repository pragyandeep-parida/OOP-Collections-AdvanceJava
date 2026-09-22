package OOP_6.ExceptionHandling;

public class Demo2
{
    public static void main(String[] args)
    {
        int age = 18;

        if (age > 15)
        {
            throw new ArithmeticException("Age not valid");
        }
    }
}
