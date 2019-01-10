package programming1exercises.exercises003.exercise3;

/**
 * Created by Sylwester Garstecki
 */
public class ReverseWord {

    public String reverse(String word){
        String reverseString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseString = reverseString + word.charAt(i);
        }
        System.out.println(reverseString);
        return reverseString;
    }

}
