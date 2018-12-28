package programming1exercises.exercises003.exercise1;

/**
 * Create by Sylwester Garstecki
 * Napisz program, który pobiera liczbę od użytkownika i sprawdza czy podana liczba
 * jest parzysta lub nieparzysta i wyświetla stosowny komunikat. + Testy
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EvenOrNot evenOrNot = new EvenOrNot();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        int number = scanner.nextInt();
        evenOrNot.evenOrNot(number);
    }
}
