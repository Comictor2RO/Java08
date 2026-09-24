package ex07;

public class ConcertNotificationTest {
	public static void main(String[] args) {
		ConcertNotifier notifier = new ConcertNotifier();
		Follower ana = new Follower("Ana");
		Follower mihai = new Follower("Mihai");

		notifier.attachObserver(ana);
		notifier.attachObserver(mihai);

		ConcertEvent firstEvent = new ConcertEvent(
				"The Java Band", "Cluj Arena", "20 iunie 2026");
		notifier.addConcertEvent(firstEvent);

		notifier.detachObserver(ana);
		ConcertEvent secondEvent = new ConcertEvent(
				"Code Festival", "Bucuresti", "5 iulie 2026");
		notifier.addConcertEvent(secondEvent);
	}
}
