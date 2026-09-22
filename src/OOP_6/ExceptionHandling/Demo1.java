package OOP_6.ExceptionHandling;

public class Demo1
{
    public static void main(String[] args)
    {
        try {
            int[] arr = {1,2,3};
            arr[5] =8;
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index error");
        }
        catch (Exception e)
        {
            System.out.println("General error");
        }
    }
}
