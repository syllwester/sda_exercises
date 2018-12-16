package programming1exercises.exercises001.exercise17;

/**
 * Created by Sylwester Garstecki
 * 17. Utwórz klasę pracownik posiadającą imię, nazwisko i wynagrodzenie. Dodaj 10
 * pracowników do kolekcji ArrayList. Korzystając ze strumieni znajdź średnie
 * wynagrodzenie pracownika, a następnie korzystając ze strumieni wyświetl wszystkich
 * pracowników zarabiających więcej niż średnia.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        List<Worker> listOfWorkers = new ArrayList();
        Worker worker;

        worker = new Worker();
        worker.name = "Sylwek";
        worker.lastname = "Garstecki";
        worker.reward = 2000;
        listOfWorkers.add(worker);

        worker = new Worker();
        worker.name = "Jan";
        worker.lastname = "Kowalski";
        worker.reward = 5200;
        listOfWorkers.add(worker);

        worker = new Worker();
        worker.name = "Andrzej";
        worker.lastname = "Andrzejowski";
        worker.reward = 3399;
        listOfWorkers.add(worker);

        worker = new Worker();
        worker.name = "Paweł";
        worker.lastname = "Pawełkowski";
        worker.reward = 4211;
        listOfWorkers.add(worker);

        worker = new Worker();
        worker.name = "Piotr";
        worker.lastname = "Piotrowski";
        worker.reward = 8000;
        listOfWorkers.add(worker);

        worker = new Worker();
        worker.name = "Gracjan";
        worker.lastname = "Gracjanowski";
        worker.reward = 1250;
        listOfWorkers.add(worker);


        OptionalDouble avarage;
        avarage = listOfWorkers.stream()
                .mapToDouble(s -> s.getReward()).average();
        Double avarageGood = avarage.getAsDouble();
        System.out.println("Średnia płaca = " + avarageGood);
        System.out.println("Pracownicy, którzy zarabiają więcej niż średnia: ");
        listOfWorkers.stream()
                .filter(w -> w.getReward()> avarageGood)
                .forEach(u -> System.out.println(u.getName() + " " + u.getLastname() + ", wypłata = " + u.getReward()));

        }
    }

