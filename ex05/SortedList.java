package ex05;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortedList<T extends Comparable<T>> {
    private List<T> elements = new ArrayList<>();

    public void add(T element){
        elements.add(element);
        Collections.sort(elements);
    }

    public List<T> getElements(){
        return elements;
    }
}
