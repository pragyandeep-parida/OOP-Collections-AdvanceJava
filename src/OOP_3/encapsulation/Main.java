package OOP_3.encapsulation;

public class Main
{
    public static void main(String[] args)
    {
        bank b1 = new bank();

        b1.setbalance(50000);    // when you remove setbalance and only print the getter it will print original value which is 100000
        System.out.println(b1.getbalance());
    }
}

/*
does the setter change the original value?

Yes. Setter updates the object’s state by overwriting the existing value.
 */
