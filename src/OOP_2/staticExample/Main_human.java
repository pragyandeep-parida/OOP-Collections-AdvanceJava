package OOP_2.staticExample;

public class Main_human
{
    public static void main(String[] args)
    {
        human pragyan = new human(26,"Pragyan",10000, false);
        human mishra = new human(26,"Mishra",50000,true);

        //System.out.println(pragyan.population);       // dont use this pragyan.population rather use human.population
        //System.out.println(mishra.population);        // As static belongs to class not an individual object so use below

        System.out.println(human.population);           //this will show 2

    }
}
