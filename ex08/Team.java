package ex08;

/**
 * Team
 */
public interface Team extends Comparable<Team>{

    public String getName();
    public int getPosition();
    public int compareTo(Team other);
}