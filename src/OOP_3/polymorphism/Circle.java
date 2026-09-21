package OOP_3.polymorphism;

public class Circle extends Shapes
{
    @Override
    void area()
    {
        System.out.println("The area is pie * r * r");
    }
}
