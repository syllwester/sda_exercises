package programming1exercises.exercises001.exercise17;

import lombok.*;

@Setter
@Getter //Why getter in lombok doesn't work?
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Worker {
    String name;
    String lastname;
    Integer reward;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getReward() {
        return reward;
    }
}
