package programming1exercises.exercises002.exercise04;

import java.util.Arrays;

public class Equals {
    public boolean equals(int[] array1, int[] array2){
        boolean eq = false;
        if (Arrays.equals(array1, array2)){
            eq = true;
        }
        System.out.println(eq);
        return eq;
    }
}
