package hrynkevych.serhii.homework8_v3;

public class Masseur extends Worker{
    Masseur(String newName, String newWorkExperience) {
        role = "массажист";
        name = newName;
        workExperience = Integer.parseInt(newWorkExperience);
    }

    public void addMassage(Client client, int numberAddWorkoutInt) {
                client.massage = +numberAddWorkoutInt;
    }
}
