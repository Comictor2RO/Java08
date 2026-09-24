package ex04;

public class Subscriber implements Observer<String> {
	private final String name;

	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(String data) {
		System.out.println(name + " a primit postarea: " + data);
	}
}
