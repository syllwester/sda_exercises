package programming1exercises.exercises001.exercise15;

/**
 * Created by Sylwester Garstecki
 * 15. Utwórz nieposortowaną kolekcję z 10 dowolnymi i unikatowymi imionami.
 * Korzystając ze strumieni posortuj kolekcję i wyświetl ją.
 */

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
