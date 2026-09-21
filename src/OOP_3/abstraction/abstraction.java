package OOP_3.abstraction;

abstract class vehicle
   {
        abstract void start();
    }
    class bike extends vehicle
    {
        void start()
        {
            System.out.println("bike starts");
        }
    }

