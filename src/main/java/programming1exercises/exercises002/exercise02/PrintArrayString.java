package programming1exercises.exercises002.exercise02;

public class PrintArrayString {

    public String printArray(int[] array){
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" x" + array[i]);
            if(i != array.length - 1){
                System.out.print(",");
            }else System.out.print(" ");

        }
        System.out.print("}");
        return String.valueOf(array);
    }
}
