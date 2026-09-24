package ex06;

public class SmartCamera implements SecurityControl{
    
    @Override 
    public void activateSecurity(){
        System.out.println("Security Camera activated");
    }
    
    @Override
    public void deactivateSecurity(){
        System.out.println("Security Camera deactivated");
    }
}
