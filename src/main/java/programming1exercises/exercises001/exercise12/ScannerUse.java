package programming1exercises.exercises001.exercise12;

import java.util.Scanner;

public class ScannerUse {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Give name: ");
        String name = scanner.next();

        System.out.println(name);
    }
}
