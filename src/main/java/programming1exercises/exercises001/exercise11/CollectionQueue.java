package programming1exercises.exercises001.exercise11;

import java.util.ArrayDeque;
import java.util.Queue;

public class CollectionQueue {
    public void collection(){
        Queue<String> something = new ArrayDeque<>();

        something.add("Sylwek");
        something.add("Janusz");
        something.add("Andrzej");
        something.add("Karol");

        System.out.println(something);
    }
}
