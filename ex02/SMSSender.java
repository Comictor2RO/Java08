package ex02;

public class SMSSender implements NotificationSender{
    
    @Override 
    public void send(String msg){
        System.out.println("SMS: " + msg);
    }
}
