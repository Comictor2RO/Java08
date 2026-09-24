package ex06;

public class SmartLight implements LightControl{
    @Override 
    public void turnOn(){
        System.out.println("The light is on");
    }

    @Override 
    public void turnOff(){
        System.out.println("The light is off");
    }
}
