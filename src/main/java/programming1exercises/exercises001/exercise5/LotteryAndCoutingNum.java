package programming1exercises.exercises001.exercise5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LotteryAndCoutingNum {
    public void lotteryAndcounting(){
        Random randomNum = new Random();

        Map<Integer,Integer> countingRepeat = new HashMap<Integer, Integer>();
        int number;



        for (int i = 0; i < 100; i++) {
            number = randomNum.nextInt(200) + 0;
            if(countingRepeat.containsKey(number)){
                countingRepeat.put(number, countingRepeat.get(number) + 1 );
            }else {
                countingRepeat.put(number, 1);
            }
        }
        System.out.println("Numbers");
        System.out.println(countingRepeat);

        List<Integer> listCountingRepeat = countingRepeat.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(entry -> entry.getKey())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Repeat: ");
        System.out.println(listCountingRepeat);

    }
}
