package programming1exercises.exercises001.exercise10;


/**
 * Created by Sylwester Garstecki
 * 10. Jesteś firmą produkującą tabliczki z imionami. Dla każdego imienia musisz
 * przygotować matrycę. Raz przygotowana matryca może być wykorzystywana
 * wielokrotnie. Korzystając z odpowiedniej kolekcji dodaj do niej imiona (co najmniej
 * 10) osób tak aby w kolekcji się nie powtarzały. Podczas dodawania dodaj kilka imion
 * powtarzających się.
 */
public class Main {
    public static void main(String[] args) {
        TableWithName table = new TableWithName();

        table.collectionSetWithNames();
        table.addName("Marek");
        table.addName("Paweł");
        table.addName("Lili");
        table.collectionSetWithNames();

    }
}
