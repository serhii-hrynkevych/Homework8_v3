package hrynkevych.serhii.homework8_v3;

import java.util.HashMap;

public class Client extends People{
    HashMap<String, Integer> workout = new HashMap<>();
    int massage = 0;

    Client(String newName) {
        name = newName;
    }

    Client() {}

    public void addWorkoutClient(String nameTrainer, int numberAddWorkoutInt) {
        workout.put(nameTrainer, numberAddWorkoutInt);
    }
}
