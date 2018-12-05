package programming1exercises.exercises001.exercise16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(22);
        numbers.add(3);
        numbers.add(88);
        numbers.add(51);

        for (Integer number: numbers) {
            System.out.println(number);
        }

        System.out.println("Min number: " + numbers.stream().min(Comparator.comparing(Integer::intValue)).get());
        System.out.println("Max number: " + numbers.stream().max(Comparator.comparing(Integer::intValue)).get());
    }
}
