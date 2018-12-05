package programming1exercises.exercises001.exercise21;

public class MyRun2 implements Runnable{
    Thread thread;
    private String name;

    public MyRun2(String name){
        this.name = name;
        thread = new Thread(this, name);
    }

    @Override
    public void run() {
        System.out.println("Rozpoczęcie wątku " + name);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Zakończenie wątku " + name);
    }
}
