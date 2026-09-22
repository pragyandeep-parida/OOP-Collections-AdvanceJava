package OOP_6.ObjectCloning;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Human PP = new Human(26,"Pragyandeep");
//        Human twin = new Human(PP);

        Human twin = (Human)PP.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] =100;
        System.out.println(Arrays.toString(PP.arr));
    }
}
