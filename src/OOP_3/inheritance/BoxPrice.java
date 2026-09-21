package OOP_3.inheritance;

public class BoxPrice extends BoxWeight             //if you forget extends the class will be not connected and show error
{
    double cost;

    public BoxPrice()
    {
        super();
        this.cost = -1;
    }

    public BoxPrice(double l,double b, double h, double  weight, double cost)
    {
        super(l,b,h,weight);
        this.cost =cost;
    }

    public BoxPrice(double side, double weight, double cost)
    {
        super(side, weight);
        this.cost =cost;
    }

}
