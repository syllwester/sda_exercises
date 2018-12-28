package programming1exercises.exercises003.exercise1;

public class EvenOrNot {

    public boolean evenOrNot(int number){
        if(number % 2 == 0){
            System.out.println("Liczba jest parzysta");
            return true;
        }else {
            System.out.println("Liczba nie jest parzysta");
            return false;
        }

    }
}
