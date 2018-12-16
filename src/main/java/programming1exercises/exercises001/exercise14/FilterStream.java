package programming1exercises.exercises001.exercise14;

/**
 * Created by Sylwester Garstecki
 * 14. Utwórz kolekcję z 10 imionami (W kolekcji musi pojawić się imię Jan). Korzystając
 * ze strumieni znajdź imię Jan i wyświetl je.
 */

import java.util.ArrayList;
import java.util.List;

public class FilterStream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Arek");
        names.add("Marek");
        names.add("Czarek");
        names.add("Michał");
        names.add("Jan");
        names.add("Andrzej");
        names.add("Paweł");
        names.add("Piotr");
        names.add("Waldek");
        names.add("Włodek");

        names.stream().filter(name -> "Jan".equals(name)).forEach(name -> System.out.println(name));
    }
}
