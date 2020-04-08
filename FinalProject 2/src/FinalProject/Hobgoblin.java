package FinalProject;

import java.util.Random;
/**
 * The Hobgoblin class is derived from the Goblinoid class
 * There are no separate data members in this class.
 * The methods included in this class are: Goblinoid(), Goblinoid(Name: String, Age: Int,
 * Class; String, Alignment: String), height(): double, weight(): double,
 * AbilityScoreIncrease(): String, Proficiencies(): String, Language(): String, Speed():
 * Int, Darkvision(): String, RaceFeatures(): String
 */

public class Hobgoblin extends Goblinoid{

    /*Method Prologues and Pseudo-code*/
    //This method acts as a constructor
    public Hobgoblin() {
    }

    //This method acts as a constructor with specific parameters
    public Hobgoblin(String name, int age, String charclass, String alignment, String race) {
        setName(name);
        setAge(age);
        setCharclass(charclass);
        setAlignment(alignment);
        setRace(race);
    }

    //This will calculate the height of a creature based on "dice rolls" and a calculation found in "Volo's Guide to Monsters"
    @Override
    public String Height() {
        Random dice1 = new Random();
        int d101 = dice1.nextInt(10) + 1;
        Random dice2 = new Random();
        int d102 = dice2.nextInt(10) + 1;
        int s = d101 + d102;
        int height = 56 + s;
        int feet = height / 12;
        int inches = height % 12;
        return feet + "\"-" + inches + "\"";
    }

    //This will calculate the weight of a creature based on "dice rolls" and a calculation found in "Volo's Guide to Monsters"
    @Override
    public String Weight() {
        Random dice1 = new Random();
        int d101 = dice1.nextInt(10) + 1;
        Random dice2 = new Random();
        int d102 = dice2.nextInt(10) + 1;
        int s = d101 + d102;
        Random dice3 = new Random();
        int d41 = dice3.nextInt(4) + 1;
        Random dice4 = new Random();
        int d42 = dice4.nextInt(4) + 1;
        int w = d41 + d42;
        return (110 + (s * w)) + " lbs";
    }

    @Override
    public String AbilityScoreIncrease() {
        return "Constitution is increased by 2 & Intelligence is increased by 1.";
    }

    @Override
    public String Proficiencies() {
        return "You are proficient with two martial weapons of your choice and with light armor.";
    }

    //These are the race specific features for Hobgoblins
    @Override
    public String OtherFeatures() {
        return "Saving Face:\n" +
                "Hobgoblins are careful not to show weakness in front of their allies, for fear of losing status. If you miss with an attack roll or fail an ability check or a saving throw, you can gain a bonus to the roll equal to the number of allies you can see within 30 feet of you (maximum bonus of +5). Once you use this trait, you can’t use it again until you finish a short or long rest.";
    }
}
