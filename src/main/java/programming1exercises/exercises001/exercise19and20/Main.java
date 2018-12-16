package programming1exercises.exercises001.exercise19and20;

/**
 * Created by Sylwester Garstecki
 * 19. Przygotuj aplikację składającą się z 2 wątków Utwórz każdy wątek samodzielnie.
 * Niech każdy wątek wyświetla liczby całkowite od 1-10.
 * 20. Zmodyfikuj aplikację tak, aby wątek 2 rozpoczął przetwarzanie po zakończeniu
 * wyświetlania liczb przez wątek 1. Skorzystaj z operacji join().
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        new MyRun().thread.join();
        new MyRun().thread.join();

    }
}
