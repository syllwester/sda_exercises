package programming1exercises.exercises002.exercise01;

/**
 * Created by Sylwester Garstecki
 * 1. Napisz program wyświetlający wyświetlający tablicę w formacie
 * { x1, x2, x3, x4, x5, x6 }
 */
public class Main {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6};

        PrintArray printArray = new PrintArray();
        printArray.printArray(tab);

    }
}
