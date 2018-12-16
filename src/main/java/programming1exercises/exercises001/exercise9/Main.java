package programming1exercises.exercises001.exercise9;

/**
 * Created by Sylwester Garstecki
 * 9. Utwórz kolejkę osób do lekarza. Dodaj 10 losowych osób i wyświetl pierwsza i
 * ostatnią osobę z kolejki. Nie korzystaj z listy ArrayList.
 */
public class Main {

    public static void main(String[] args) {
        QueueToTheDoctor queueToTheDoctor = new QueueToTheDoctor();

        queueToTheDoctor.queueFirstAndLast();
    }
}
