package programming1exercises.exercises001.exercise5;


/**
 * Created by Sylwester Garstecki
 * 5. Przygotuj program, który losuje 100 wartości z przedziału 0-200 korzystając z klasy
 * Random. Program po losowaniu zlicza powtórzenia każdej z liczb i wyświetla 5 liczb
 * które najczęściej się powtarzają w kolejności malejącej..
 */
public class Main {
    public static void main(String[] args) {
        LotteryAndCoutingNum lottery = new LotteryAndCoutingNum();

        lottery.lotteryAndcounting();
    }
}
