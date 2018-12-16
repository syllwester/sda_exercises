package programming1exercises.exercises001.exercise11;

/**
 * Created by Sylwester Garstecki
 * 11. Jesteś osobą przetwarzająca zadania w kolejności w jakiej do Ciebie przyszły
 * (kolejka FIFO). Wykorzystaj do tego odpowiednią kolekcję. Dodaj 10 zadań, a
 * następnie pobierz je z kolekcji w takiej kolejności w jakiej zostały do niej dodane.
 */
public class Main {
    public static void main(String[] args) {
        CollectionQueue collectionQueue = new CollectionQueue();

        collectionQueue.collection();
    }
}
