package programming1exercises.exercises001.exercise21;

/**
 * Created by Sylwester Garstecki
 * 21. Utwórz aplikację wielowątkową. Skorzystaj ze stałej (5 sztuk) puli wątków. Niech
 * każdy wątek wyświetla kolejno liczby z przedziału 1-10. Każdy z wątków powinien
 * dodatkowo wyświetlać informację o rozpoczęciu przetwarzania i jego zakończeniu.
 */
public class Main {
    public static void main(String[] args) {
        MyRun2 myRun1 = new MyRun2("One");
        MyRun2 myRun2 = new MyRun2("Two");
        MyRun2 myRun3 = new MyRun2("Three");
        MyRun2 myRun4 = new MyRun2("Four");
        MyRun2 myRun5 = new MyRun2("Five");


        myRun1.thread.start();
        myRun2.thread.start();
        myRun3.thread.start();
        myRun4.thread.start();
        myRun5.thread.start();
    }
}
