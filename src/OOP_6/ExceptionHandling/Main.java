package OOP_6.ExceptionHandling;

public class Main
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 0;

        try {
//            divide(5,0);

            String name ="Lovan";
            if (name.equals("Lovan"))
            {
                throw new MyException("The name is correct");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("Normal exception");
//        }
        finally {
            System.out.println("This will work");
        }
    }
     static int divide(int a, int b) throws ArithmeticException
     {
         if (b == 0)
         {
             throw new ArithmeticException("Please enter a valid number");
         }
         return a/b;
     }
}
