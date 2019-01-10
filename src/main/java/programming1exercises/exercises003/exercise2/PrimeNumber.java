package programming1exercises.exercises003.exercise2;

/**
 * Created by Sylwester Garstecki
 */

public class PrimeNumber {
    public boolean isPrime(int number){
        boolean result = true;
        double sq = Math.sqrt(number);

        if(number < 2){
            result = false;
        } else for (int i = 2; i <= sq; i++){
            if (number % i == 0){
                result = false;
                break;
            }
        }

        System.out.println("Liczba " + number + (result == true ? " jest" : " nie jest") + " liczbą pierwszą.");
        return result;
    }
}
