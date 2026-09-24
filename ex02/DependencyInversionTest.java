package ex02;

public class DependencyInversionTest {
	public static void main(String[] args) {
		NotificationManager manager = new NotificationManager();

		manager.addSender(new EmailSender());
		manager.addSender(new SMSSender());

		manager.sendNotification("Ai primit o notificare noua.");
	}
}
