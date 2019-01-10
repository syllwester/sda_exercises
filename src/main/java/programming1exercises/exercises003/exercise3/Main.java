package programming1exercises.exercises003.exercise3;

import java.util.Scanner;

/**
 * Created by Sylwester Garstecki
 * Napisz program, który pobiera od użytkownika wyraz lub zdanie i tworzy z niego
 * odwrotność. Dla słowa “grzegżółka” program zwraca “akłóżgezrg”.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReverseWord reverseWord = new ReverseWord();

        System.out.println("Podaj słowo lub zdanie: ");
        String word = scanner.nextLine();

        reverseWord.reverse(word);
    }

}
