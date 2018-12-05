package programming1exercises.exercises001.exercise4;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setLastname("Garstecki");
        person1.setName("Sylwester");
        person1.setPesel("1234567890");

        person2.setLastname("Ambroziak");
        person2.setName("Judyta");
        person2.setPesel("1234567890");

        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
