package programming1exercises.exercises001.exercise13;

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
