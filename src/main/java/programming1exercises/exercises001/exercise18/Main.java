package programming1exercises.exercises001.exercise18;

public class Main implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        new Thread(new Main()).start();
    }
}
