package OOP_3.inheritance;

//using this Main2 for types of inheritance

public class Main2
{
    public static void main(String[] args)
    {
        BoxPrice b1 = new BoxPrice();
        BoxPrice b2 = new BoxPrice(1,2,3,4,5);
        BoxPrice b3 = new BoxPrice(5,10,15);


        System.out.println(b1.l + " " + b1.b + " " + b1.h + " " + b1.weight + " " + b1.cost);
        System.out.println(b2.l + " " + b2.b + " " + b2.h + " " + b2.weight + " " + b2.cost);
        System.out.println(b3.l + " " + b3.b + " " + b3.h + " " + b3.weight + " " + b3.cost);
    }
}
