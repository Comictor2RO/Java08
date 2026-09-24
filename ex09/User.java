package ex09;

public class User {
    private String name;
    private String favouriteGenre;

    User(String name, String genre){
        this.name = name;
        this.favouriteGenre = genre;
    }

    public String getName(){
        return name;
    }

    public String getGenre(){
        return favouriteGenre;
    }

    public void receiveRecommendation(Content content){
        System.out.println(name + " received: " + content);
    }
}
