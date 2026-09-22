package OOP_5.interfaces;

public class NiceCar
{
    private Engine engine;
    private CDplayer cdplayer;

    public NiceCar() {
        engine = new PowerEngine();                 //if i write new ElectricEngine() then in the carmain when i use start the electric engine star() will run
    }

    public void start(){
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }



}
