package OOP_4;

public class A
{
    private int num;            //use private in num and check how it works where
    protected String name;
    int[] arr;

    public void setnum(int num)
    {
        this.num =num;
    }

    public int getnum()
    {
        return num;
    }

    public  A(int num, String name)
    {
        this.num = num;
        this.name = name;
        this.arr =new int[]{num};
    }
}

