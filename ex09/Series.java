package ex09;

public class Series implements Content{
    private String title;
    private String genre;

    Series(String title, String genre){
        this.title = title;
        this.genre = genre;
    }

    @Override 
    public String getTitle(){
        return title;
    }

    @Override 
    public String getGenre(){
        return genre;
    }

    @Override 
    public String toString(){
        return "Serie: " + title + " [ " + genre + " ] ";
    }
}
