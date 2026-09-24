package ex09;

public class SsreTest {
    public static void main(String[] args) {
	RecommendationAlgorithm<Content> algorithm =
		new GenreRecommendationAlgorithm<>();
	RecommendationEngine<Content> engine =
		new RecommendationEngine<>(algorithm);
	StreamingService<Content> service =
		new StreamingService<>(engine);

	User ana = new User("Ana", "Drama");
	User mihai = new User("Mihai", "Actiune");
	User elena = new User("Elena", "Comedie");
	User radu = new User("Radu", "Science-Fiction");

	service.registerUser(ana);
	service.registerUser(mihai);
	service.registerUser(elena);
	service.registerUser(radu);

	System.out.println("=== Se adauga continut Drama ===");
	service.addContent(new Movie("The Green Mile", "Drama"));

	System.out.println("\n=== Se adauga continut Actiune ===");
	service.addContent(new Movie("Mad Max: Fury Road", "Actiune"));

	System.out.println("\n=== Se adauga un serial de Comedie ===");
	service.addContent(new Series("The Office", "Comedie"));

	System.out.println("\n=== Se adauga un serial Science-Fiction ===");
	service.addContent(new Series("Stranger Things", "Science-Fiction"));

	System.out.println("\n=== Se adauga continut fara utilizatori interesati ===");
	service.addContent(new Movie("Planet Earth", "Documentar"));

	System.out.println("\n=== Se adauga al doilea continut Drama ===");
	service.addContent(new Series("Chernobyl", "Drama"));
    }
}
