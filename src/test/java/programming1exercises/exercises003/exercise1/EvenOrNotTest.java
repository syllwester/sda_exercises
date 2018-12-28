package programming1exercises.exercises003.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOrNotTest {

    EvenOrNot evenOrNot = new EvenOrNot();

    @Test
    public void shouldShowIfTheNumberIsEven() {
        int numberEven = 6;
        assertTrue(evenOrNot.evenOrNot(numberEven));
    }

    @Test
    public void shouldShowIfTheNumberIsNotEven() {
        int numberNotEven = 7;
        assertFalse(evenOrNot.evenOrNot(numberNotEven));
    }
}