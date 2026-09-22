package OOP_5.interfaces;

public class CDplayer implements Media
{
    @Override
    public void start()
    {
        System.out.println("cd player will start");
    }

    @Override
    public void stop()
    {
        System.out.println("cd player will stop");
    }
}
