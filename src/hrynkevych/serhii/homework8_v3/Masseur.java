package hrynkevych.serhii.homework8_v3;

public class Masseur extends Worker{
    Masseur(String newName, String newWorkExperience) {
        role = "массажист";
        name = newName;
        workExperience = Integer.parseInt(newWorkExperience);
    }

    public void addMassage(String nameTrainer, String nameClient, int numberAddWorkoutInt) {
        Admin admin = new Admin();
        for (Client c : admin.clients) {
            if (c.name.equals(nameClient)) {
                c.massage = ++numberAddWorkoutInt;
            }
        }
    }
}
