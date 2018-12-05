package programming1exercises.exercises001.exercise19and20;

public class MyRun implements Runnable {

    Thread thread;

    public MyRun() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

