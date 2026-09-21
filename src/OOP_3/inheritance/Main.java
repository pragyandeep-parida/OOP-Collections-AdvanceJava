package OOP_3.inheritance;

public class Main
{
    public static void main(String[] args)
    {
        Box b1 = new Box();                   // it will check box() in Box.java
        Box b2 = new Box(5);            // it will check  Box(double side) in Box.java
        Box b3 = new Box(1.1,2.5,3.6);    //it will check Box(double l, double b, double h) in Box.java
        Box b4 = new Box(b1);


        BoxWeight b5 = new BoxWeight();                                      // from the inheritance part BoxWeight
        BoxWeight b6 = new BoxWeight(1.1,2.1,3.1,4.5);       // from the inheritance part BoxWeight
        BoxWeight b7 = new BoxWeight(5,8);                       // from the inheritance part BoxWeight

        System.out.println(b1.l + " " + b1.b + " " + b1.h);         //for object b1
        System.out.println(b2.l + " " + b2.b + " " + b2.h);         //for object b2
        System.out.println(b3.l + " " + b3.b + " " + b3.h);         //for object b3
        System.out.println(b4.l + " " + b4.b + " " + b4.h);

        System.out.println();                                       //gave to give a gap

        System.out.println(b5.l + " " + b5.b + " " + b5.h + " " + b5.weight);      // from the inheritance part BoxWeight
        System.out.println(b6.l + " " + b6.b + " " + b6.h + " " + b6.weight);      //from the inheritance part BoxWeight
        System.out.println(b7.l + " " + b7.b + " " + b7.h + " " + b7.weight);     //from the inheritance part BoxWeight
    }
}
