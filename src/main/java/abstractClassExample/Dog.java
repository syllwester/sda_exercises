package abstractClassExample;

public class Dog extends Animal {

    public String getSound(String sound) {
        System.out.println(sound);
        return sound;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getSound("Hau Hau");
    }
}
