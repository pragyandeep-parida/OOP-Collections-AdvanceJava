package OOP_4;

public class ObjectDemo
{
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa)
    {
        this.num = num;
        this.gpa =gpa;
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();            // if you only write return num then the hashcode will only print the number wont give hash value
    }

    @Override
    public boolean equals(Object obj)
    {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

    public static void main(String[] args)
    {
        ObjectDemo obj = new ObjectDemo(23,86.3f);
        ObjectDemo obj2 = new ObjectDemo(23,86.3f);

//        System.out.println(obj.hashCode());      // see the hashcode value like this
//        System.out.println(obj2.hashCode());     //if the number is same and object is different the hashcode value will also be different

        if (obj == obj2)
        {
            System.out.println("They are equal");
        }
        else if (obj.equals(obj2))
        {
            System.out.println("They are equal in .equal()");           // return this.num == ((ObjectDemo)obj).num; after doing this then only it will show this as true
        }


        System.out.println(obj.getClass());     //getclass() method is used to get data about the class the object is in

    }


}
