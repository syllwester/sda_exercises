package programming1exercises.exercises003.exercise2;

import java.util.Scanner;

/**
 * Created by Sylwester Garstecki
 * Napisz program, który pobiera liczbę od użytkownika i sprawdza czy wprowadzona
 * liczba jest liczbą pierwszą. Program wyświetla komunikat
 * “Podana liczba <liczba> jest liczbą pierwszą”
 * lub
 * “Podana liczba <liczba> nie jest liczbą pierwszą”
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrimeNumber primeNumber = new PrimeNumber();

        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        primeNumber.isPrime(number);

    }

}
