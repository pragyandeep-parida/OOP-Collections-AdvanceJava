package Threads;

class a implements java.lang.Runnable
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class b implements java.lang.Runnable
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableDemo
{
    public static void main(String[] args)
    {
        java.lang.Runnable obj1 = new a();
        java.lang.Runnable obj2=new b();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}



