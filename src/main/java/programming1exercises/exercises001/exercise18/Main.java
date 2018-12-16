package programming1exercises.exercises001.exercise18;

/**
 * Created by Sylwester Garstecki
 * 18. Przygotuj aplikację uruchamiającą jeden wątek. Niech wątek wyświetla informację
 * hello world.
 */
public class Main implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        new Thread(new Main()).start();
    }
}
