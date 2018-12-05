package programming1exercises.exercises001.exercise4;

public class Person {
    String name;
    String lastname;
    String pesel;

    @Override
    public String toString() {
        return "Name = " + String.format(name, "%s") + "\n" +
                "Lastname =" + String.format(lastname, "%s") + "\n" +
                "Pesel = " + String.format(pesel, "%s") + "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setPesel(String pesel){
        this.pesel = pesel;
    }
}
