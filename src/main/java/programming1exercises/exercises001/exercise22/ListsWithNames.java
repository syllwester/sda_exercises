package programming1exercises.exercises001.exercise22;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListsWithNames {

     public static List<String> listOfNames = new ArrayList<>();
     public static List<String> listOfLastname = new ArrayList<>();

     public ListsWithNames(){
         listOfNames.add("Sylwek1");
         listOfNames.add("Sylwek2");
         listOfNames.add("Sylwek3");
         listOfNames.add("Sylwek4");
         listOfNames.add("Sylwek5");
         listOfNames.add("Sylwek6");
         listOfNames.add("Sylwek7");
         listOfNames.add("Sylwek8");
         listOfNames.add("Sylwek9");
         listOfNames.add("Sylwek10");

         listOfLastname.add("Kowalski1");
         listOfLastname.add("Kowalski2");
         listOfLastname.add("Kowalski3");
         listOfLastname.add("Kowalski4");
         listOfLastname.add("Kowalski5");
         listOfLastname.add("Kowalski6");
         listOfLastname.add("Kowalski7");
         listOfLastname.add("Kowalski8");
         listOfLastname.add("Kowalski9");
         listOfLastname.add("Kowalski10");
     }

    static Random random = new Random();
    public static String randomName(){
        int position = random.nextInt(9);
        String name = listOfNames.get(position);
        return name;
    }

    public static String randomSurname(){
        int position = random.nextInt(9);
        String lastname = ListsWithNames.listOfLastname.get(position);
        return lastname;
    }

    public static Integer randomAge(){
        int age = random.nextInt(99) + 1;
        return age;
    }

    public String randomFileName() {
        Integer number = random.nextInt(50);
        String name = "File " + number;
        return name;
    }
}
