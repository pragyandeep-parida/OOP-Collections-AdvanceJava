package OOP_2.staticExample;

public class StaticBlock
{
    static int a=10;
    static int b;

    static
    {
        System.out.println("This is static block");
        b = 2 * a;
    }

    public static void main(String[] args)
    {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();                        //The static block having "This is static block" will only run once
        System.out.println(StaticBlock.a + " " + StaticBlock.b);     //Because the static block runs when the class is loaded into memory.
                                                                     // A class is loaded by the JVM only once during program execution.Therefore, the static block also executes only one time, no matter how many objects you create.
    }

}
