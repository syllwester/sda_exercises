package programming1exercises.exercises001.exercise6;

/**
 * Created by Sylwester Garstecki
 * 6. Wylosuj 1000 liczb z zakresu 1000-2000 i zapisz je do listy. Skorzystaj z stream() w
 * liście do wyszukania najmniejszej i największej wartości.
 */

public class Main {
    public static void main(String[] args) {
        RandomNumbersAndGetMinMax lottery = new RandomNumbersAndGetMinMax();

        lottery.lotteryMaxMin();
    }
}
