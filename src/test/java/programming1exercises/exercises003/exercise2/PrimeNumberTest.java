package programming1exercises.exercises003.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void shouldShowIfNumberIsPrimeOrNot() {
        PrimeNumber primeNumber = new PrimeNumber();
        int numberPrime = 17;
        int numberNotPrime = 15;
        assertTrue(primeNumber.isPrime(numberPrime));
        assertFalse(primeNumber.isPrime(numberNotPrime));
    }

}