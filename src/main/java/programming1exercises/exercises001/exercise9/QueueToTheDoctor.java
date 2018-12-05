package programming1exercises.exercises001.exercise9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueToTheDoctor {
    public void queueFirstAndLast(){
        Deque<String> deque = new ArrayDeque();

        for (int i = 0; i < 10; i++) {
            deque.add("Sylwek" + (i+1));
        }

        System.out.println("First person: " + deque.getFirst());
        System.out.println("Last person: " + deque.getLast());
    }
}
