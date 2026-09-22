package OOP_5;

public class Main
{
    public static void main(String[] args)
    {
        Son s = new Son(25);
        s.career();
        s.partner();


        Daughter d = new Daughter(21);
        d.career();
        d.partner();

        System.out.println(" ");

        Parent.hello();
        s.normal();   // non static methods can be called through objects
    }

}
