package programming1exercises.exercises002.exercise05;

import java.util.Arrays;

public class CopyArray {
    public int[] copyArray(int[] array){
        int[] newArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Array: " + array[i]);
            System.out.print("  CopyArray: " + newArray[i]);
            System.out.println(" ");
        }
        return newArray;
    }
}
