package ex02;

public class EmailSender implements NotificationSender{
    
    @Override 
    public void send(String msg){
        System.out.println("Email: " + msg);
    }
}
