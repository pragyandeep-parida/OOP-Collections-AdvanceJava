package OOP_6.ExceptionHandling;

public class Demo
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 0;

        try {
            int c = a/b;
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("run code regardless");
        }
    }
}
