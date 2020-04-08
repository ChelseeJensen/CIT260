package FinalProject;

import java.util.Random;
/**
 * The Goblin class is derived from the Goblinoid class.
 * There are no separate data members in this class.
 * The methods included in this class are: Goblinoid(), Goblinoid(Name: String, Age: Int,
 * Class; String, Alignment: String), height(): double, weight(): double,
 * AbilityScoreIncrease(): String, Proficiencies(): String, Language(): String, Speed():
 * Int, Darkvision(): String, RaceFeatures(): String
 */

public class Goblin extends Goblinoid{

    /*Method Prologues and Pseudo-code*/
    //This method acts as a constructor
    public Goblin() {
        }

    //This method acts as a constructor with specific parameters
    public Goblin(String name, int age, String charclass, String alignment, String race) {
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
        int d41 = dice1.nextInt(4) + 1;
        Random dice2 = new Random();
        int d42 = dice2.nextInt(4) + 1;
        int s = d41 + d42;
        int height = 41 + s;
        int feet = height / 12;
        int inches = height % 12;
        return feet + "\"-" + inches + "\"";
    }

    //This will calculate the weight of a creature based on "dice rolls" and a calculation found in "Volo's Guide to Monsters"
    @Override
    public String Weight() {
        Random dice1 = new Random();
        int d41 = dice1.nextInt(4) + 1;
        Random dice2 = new Random();
        int d42 = dice2.nextInt(4) + 1;
        int s = d41 + d42;
        return (35 + s) + " lbs";
    }

    //These are the race specific features for Goblins
    @Override
    public String OtherFeatures() {
        return "Fury of the Small:\n" +
                "When you damage a creature with an attack or a spell and the creature’s size is larger than yours, you can cause the attack or spell to deal extra damage to the creature. The extra damage equals your level. Once you use this trait, you can’t use it again until you finish a short or long rest.\n" +
                "Nimble Escape:\n" +
                "You can take the Disengage or Hide action as a bonus action on each of your turns.";
    }
}
