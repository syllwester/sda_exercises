package programming1exercises.exercises003.exercises4;

import java.util.HashMap;

public class ChangeOfCharacters {
    public String changePolishCharacters(String sentence){
        HashMap<Character, Character> polishCharacters = new HashMap<>();

        polishCharacters.put('ą', 'a');
        polishCharacters.put('ę', 'e');
        polishCharacters.put('ś', 's');
        polishCharacters.put('ć', 'c');
        polishCharacters.put('ź', 'z');
        polishCharacters.put('ż', 'z');
        polishCharacters.put('ł', 'l');
        polishCharacters.put('ó', 'o');
        polishCharacters.put('ń', 'n');
        polishCharacters.put('Ą', 'A');
        polishCharacters.put('Ę', 'E');
        polishCharacters.put('Ś', 'S');
        polishCharacters.put('Ć', 'C');
        polishCharacters.put('Ź', 'Z');
        polishCharacters.put('Ż', 'Z');
        polishCharacters.put('Ł', 'L');
        polishCharacters.put('Ó', 'O');
        polishCharacters.put('Ń', 'N');

        for (int i = 0; i < sentence.length(); i++) {
            if(polishCharacters.containsKey(sentence.charAt(i)) == true){
                sentence = sentence.replace(sentence.charAt(i), polishCharacters.get(sentence.charAt(i)));
            }
        }

        System.out.println(sentence);
        return sentence;
    }
}
