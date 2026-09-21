package OOP_3.inheritance;

public class BoxWeight extends Box
{
    double weight;

   public  BoxWeight()
    {
        this.weight = -1;
    }

    public BoxWeight(double l, double b, double h,double weight)
    {
        super(l, b, h);          // calls the parent class constructor, used to initialise value in present parent class
        this.weight = weight;
    }

    public  BoxWeight(double side, double weight)
    {
     super(side);
     this.weight = weight;
    }
}

