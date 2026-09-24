package ex08;

public class EsportsTeam implements Team{
    private String name;
    private int position;

    public EsportsTeam(String name, int position){
        this.name = name;
        this.position = position;
    }

    @Override 
    public String getName(){
        return name;
    }

    @Override 
    public int getPosition(){
        return position;
    }

    @Override 
    public int compareTo(Team other){
        return Integer.compare(position, other.getPosition());
    }
}
