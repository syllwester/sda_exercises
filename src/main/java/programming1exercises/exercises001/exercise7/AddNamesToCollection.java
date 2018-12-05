package programming1exercises.exercises001.exercise7;

import java.util.Set;
import java.util.TreeSet;

public class AddNamesToCollection {
    public void addName(){
        Set nameCollection = new TreeSet();

        nameCollection.add("Sylwek");
        nameCollection.add("Judyta");
        nameCollection.add("Kicia");
        nameCollection.add("Beata");
        nameCollection.add("Włodek");

        System.out.println(nameCollection);

    }
}
