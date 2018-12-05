package programming1exercises.exercises001.exercise19and20;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new MyRun().thread.join();
        new MyRun().thread.join();

    }
}
