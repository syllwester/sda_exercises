package programming1exercises.exercises002.exercise06;

public class Reverse {
    public void reverse(int[] array){
        System.out.print("{");
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + ", ");
        }
        System.out.print("}");
    }
}
