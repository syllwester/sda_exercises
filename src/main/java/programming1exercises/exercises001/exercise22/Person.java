package programming1exercises.exercises001.exercise22;


import lombok.*;

@Getter
@Setter
//@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private String lastname;
    private Integer age;

    public Person(String name, String lastname, Integer age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
}
