package programming1exercises.exercises001.exercise7;

import java.util.Set;
import java.util.TreeSet;

public class AddNamesToCollection {
    public void addName(){
        Set nameCollection = new TreeSet();

        nameCollection.add("Jan");
        nameCollection.add("Piotr");
        nameCollection.add("Sylwek");
        nameCollection.add("Andrzej");
        nameCollection.add("Włodek");

        System.out.println(nameCollection);

    }
}
