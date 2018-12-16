package programming1exercises.exercises002.exercise02;


/**
 * Created by Sylwester Garstecki
 * 2. Napisz program zwracający zwracający tablicę w następującym formacie tekstowym
 * { x1, x2, x3, x4, x5, x6 }
 * Metoda wyświetlająca tablicę ma następującą sygnaturę
 * public String printArray(int[] array)
 */
public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        PrintArrayString printArrayString = new PrintArrayString();
        printArrayString.printArray(array);
    }


}
