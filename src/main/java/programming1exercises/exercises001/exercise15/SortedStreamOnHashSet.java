package programming1exercises.exercises001.exercise15;

import java.util.HashSet;
import java.util.Set;

public class SortedStreamOnHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Sylwek");
        names.add("Judyta");
        names.add("Artur");
        names.add("Sylwester");
        names.add("Miś");
        names.add("Andrzej");
        names.add("Arek");
        names.add("Lili");
        names.add("Wiktor");

        System.out.println(names);

        names.stream().sorted().forEach(name -> System.out.println(name));
    }
}
