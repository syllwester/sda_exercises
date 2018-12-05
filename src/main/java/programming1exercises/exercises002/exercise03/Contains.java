package programming1exercises.exercises002.exercise03;

public class Contains {
    public boolean contains(int[] array, int key){
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                found = true;
            }
        }
        System.out.println(found);
        return found;
    }
}
