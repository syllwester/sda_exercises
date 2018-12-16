package programming1exercises.exercises002.exercise03;

/**
 * Created by Sylwester Garstecki
 * 3. Napisz program, który sprawdza czy w danej tablicy “array” znajduje się szukana
 * liczba “key”. Sygnatura metody jest następująca:
 * public boolean contains(int[] array, int key)
 */
public class Main {
    public static void main(String[] args) {
        Contains contains = new Contains();
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int num1 = 4;
        int num2 = 8;
        contains.contains(array, num1);
        contains.contains(array, num2);
    }
}
