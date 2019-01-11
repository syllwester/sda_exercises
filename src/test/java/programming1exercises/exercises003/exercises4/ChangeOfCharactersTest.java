package programming1exercises.exercises003.exercises4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeOfCharactersTest {

    @Test
    public void shouldChangeOfPolishCharacters() {
        ChangeOfCharacters change = new ChangeOfCharacters();
        String sentenceWithPolishCharacters = "Łabędź leży na łące.";

        Assert.assertEquals("Labedz lezy na lace.",change.changePolishCharacters(sentenceWithPolishCharacters));
    }
}