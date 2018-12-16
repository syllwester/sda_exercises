package programming1exercises.exercises001.exercise13;

/**
 * Created by Sylwester Garstecki
 * 13. Utwórz kolekcję, na następnie dodaj do niej 5 imion. Korzystając z Stream zmodyfikuj
 * kolekcję tak, aby imiona były pisane dużymi literami (UPPERCASE), a następnie
 * wyświetl wszystkie imiona.
 */

import java.util.ArrayList;
import java.util.List;

public class UpperCaseStream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Sylwek");
        names.add("Judyta");
        names.add("Marek");
        names.add("Arek");
        names.add("Czarek");

        for (String name:
             names) {
            System.out.println(name);
        }

        System.out.println(" ");

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));

    }
}
