package OOP_3.polymorphism;

public class Main
{
    public static void main(String[] args)
    {
        Shapes s = new Shapes();
        Circle c = new Circle();
        Square sq = new Square();

        Shapes asq = new Square(); // here my reference variable is shapes but object is created for square
                                    //Parent reference = Child object; ✅ allowed //Child reference  = Parent object;❌ NOT allowed

        s.area();
        c.area();
        sq.area();

        asq.area();         //Parent reference = Child object; ✅ allowed  //Child reference  = Parent object; ❌ NOT allowed  //that's why area of square shows even when reference is shapes



    }
}
