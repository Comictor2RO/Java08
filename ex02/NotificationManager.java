package ex02;

import java.util.List;
import java.util.ArrayList;

public class NotificationManager {
    private List<NotificationSender> senders = new ArrayList<>();

    public void addSender(NotificationSender sender){
        senders.add(sender);
    }

    public void sendNotification(String msg){
        for(NotificationSender sender : senders){
            sender.send(msg);
        }
    }
    
}