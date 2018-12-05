package programming1exercises.exercises001.exercise10;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TableWithName {
    Set<String> names = new TreeSet<>();
    public void collectionSetWithNames(){


        names.add("Sylwek");
        names.add("Judyta");
        names.add("Artur");
        names.add("Andrzej");
        names.add("Marek");
        names.add("Arnold");
        names.add("Czarek");

        System.out.println(names);
    }

    public void addName(String name){
            names.add(name);
    }
}
