package programming1exercises.exercises002.exercise06;

/**
 * Created by Sylwester Garstecki
 * 6. Napisz program, który zwraca tablicę w kolejności odwrotnej niż podana.
 * Przykładowo dla tablicy [1, 5, 6, 9, 55] program zwraca tablicę [55, 9, 6, 5, 1].
 * Sygnatura metody odwracającej tablicę jest następująca:
 * public void reverse(int[] array)
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        Reverse reverse = new Reverse();

        reverse.reverse(array);
    }
}
