package programming1exercises.exercises001.exercise3;

/**
 * Creted by Sylwester Garstecki
 * 3. Przygotuj program losujący 20 liczb całkowitych. Program musi pamiętać
 * wylosowane liczby i jeśli liczba wylosowana się powtórzyła następuje ponowne
 * losowanie, aż do wylosowania liczby unikalnej.
 */
public class Main {
    public static void main(String[] args) {
        RandomMethod randomMethod = new RandomMethod();
        randomMethod.getRandomNumbers();
    }
}
