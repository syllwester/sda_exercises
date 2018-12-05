package programming1exercises.exercises001.exercise3;

import java.util.Random;

public class RandomMethod {
    public void getRandomNumbers() {
        Random random = new Random();
        int tabRandom[] = new int[20];

        for (int i = 0 ; i < 20; i++) {
            int num = random.nextInt(50);

            for (int j = 0; j < i; j++){
                if (tabRandom[j] == num){
                    i=i-1;
                    break;
                }else {
                    tabRandom[i] = num;
                }
            }
        }

        for (int s = 0; s < 20; s++) {
            System.out.println(tabRandom[s]);
        }

    }
}
