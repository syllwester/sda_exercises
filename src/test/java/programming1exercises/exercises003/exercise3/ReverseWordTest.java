package programming1exercises.exercises003.exercise3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordTest {

    @Test
    public void shouldShowReverseWords() {
        ReverseWord reverseWord = new ReverseWord();
        String word = "Ala ma kota.";

        Assert.assertEquals(".atok am alA", reverseWord.reverse(word));

    }
}