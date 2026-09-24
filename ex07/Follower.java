package ex07;

public class Follower implements Observer<ConcertEvent> {
	private final String name;

	public Follower(String name) {
		this.name = name;
	}

	@Override
	public void update(ConcertEvent event) {
		System.out.println(name + " a primit notificarea: " + event);
	}
}
