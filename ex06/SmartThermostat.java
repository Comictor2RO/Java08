package ex06;

public class SmartThermostat implements TemperatureControl{
    
    @Override 
    public void setTemperature(double temperature){
        System.out.println("The temperature was set to " + temperature);
    }
}
