package programming1exercises.exercises003.exercises4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChangeOfCharacters change = new ChangeOfCharacters();

        System.out.println("Wprowadź zdanie lub wyraz: ");
        String sentence = scanner.nextLine();

        System.out.println("Po zamianie znaków diakrytycznych: ");
        change.changePolishCharacters(sentence);
    }
}
