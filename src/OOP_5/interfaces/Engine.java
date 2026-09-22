package OOP_5.interfaces;

public interface Engine
{
    int PRICE = 100000;    // all variables in the interface are already final and static so no need to define


    void start();       // Interface abstract methods cannot have body. So if if you give a body here it will show error
    void stop();
    void acc();
}
