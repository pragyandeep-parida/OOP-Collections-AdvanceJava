package OOP_6.ObjectCloning;

public class Human implements Cloneable
{
    int age;
    String name;
    int[] arr;

    public Human( int age,String name )
    {
        this.age = age;
        this.name =name;
        this.arr = new int[]{3,4,5,6,7};
    }

    public Human(Human other)
    {
        this.age = other.age;
        this.name = other.name;
        this.arr = new int[]{3,4,5,6,7};
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException
//    {
//        //This is Shallow copy
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        //This is Shallow copy
        Human twin =(Human)super.clone(); //this is actually shallow copy

        //make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++)
        {
         twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
