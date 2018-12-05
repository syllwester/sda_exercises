package programming1exercises.exercises001.exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbersToCollection {
    public void lotteryAndAdd(){
        Random randomNumber = new Random();

        List listOfNumbers = new ArrayList();

        for (int i = 0; i < 10; i++) {
            listOfNumbers.add(randomNumber.nextInt(20));

            System.out.println(listOfNumbers.get(i));
        }
    }
}
