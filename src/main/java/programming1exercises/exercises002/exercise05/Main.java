package programming1exercises.exercises002.exercise05;

/**
 * Created by Sylwester Garstecki
 * 5. Napisz program, który zwraca kopię podanej tablicy. Sygnatura metody kopiującej
 * jest następująca:
 * public int[] copyArray(int[] array)
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        CopyArray copyArray = new CopyArray();
        copyArray.copyArray(array);
    }
}
