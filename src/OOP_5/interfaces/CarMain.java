package OOP_5.interfaces;

public class CarMain
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.start();
        c1.stop();
        c1.acc();
        c1.brake();

        Media m1 = new Car();
        m1.stop();

//        NiceCar n1 = new NiceCar();    //see the nice car java code
//        n1.start();
    }
}
