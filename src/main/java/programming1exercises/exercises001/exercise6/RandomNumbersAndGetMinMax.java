package programming1exercises.exercises001.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbersAndGetMinMax {
    public void lotteryMaxMin(){
        Random randomNumbers = new Random();

        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            listOfNumbers.add(randomNumbers.nextInt(2000)+1000);
        }

        int max = listOfNumbers.stream().max(Integer::compareTo).get();
        int min = listOfNumbers.stream().min(Integer::compareTo).get();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
