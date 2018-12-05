package programming1exercises.exercises002.exercise03;

public class Main {
    public static void main(String[] args) {
        Contains contains = new Contains();
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int num1 = 4;
        int num2 = 8;
        contains.contains(array, num1);
        contains.contains(array, num2);
    }
}
