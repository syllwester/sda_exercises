package programming1exercises.exercises002.exercise04;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {1,2,3};

        Equals equals = new Equals();
        equals.equals(array1, array2);
        equals.equals(array1, array3);

    }
}
