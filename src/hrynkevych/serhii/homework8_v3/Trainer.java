package hrynkevych.serhii.homework8_v3;

public class Trainer extends Worker{
    Trainer(String newName, String newWorkExperience) {
        role = "тренер";
        name = newName;
        workExperience = Integer.parseInt(newWorkExperience);
    }

    Trainer() {}



}
