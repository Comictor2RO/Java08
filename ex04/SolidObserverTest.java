package ex04;

public class SolidObserverTest {
	public static void main(String[] args) {
		Blog blog = new Blog();
		Subscriber firstSubscriber = new Subscriber("Ana");
		Subscriber secondSubscriber = new Subscriber("Mihai");

		blog.attachObserver(firstSubscriber);
		blog.attachObserver(secondSubscriber);
		blog.addPost("Prima postare de pe blog.");

		blog.detachObserver(firstSubscriber);
		blog.addPost("A doua postare de pe blog.");
	}
}
