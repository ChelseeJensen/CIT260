package FinalProject;

import java.util.Random;

/**
 * The Bugbear class is derived from the Goblinoid class
 * There are no separate data members in this class.
 * The methods included in this class are: Goblinoid(), Goblinoid(Name: String, Age: Int,
 * Class; String, Alignment: String), height(): double, weight(): double,
 * AbilityScoreIncrease(): String, Proficiencies(): String, Language(): String, Speed():
 * Int, Darkvision(): String, RaceFeatures(): String
 */

public class Bugbear extends Goblinoid{

    /*Method Prologues and Pseudo-code*/
    //This method acts as a constructor
    public Bugbear() {
    }

    //This method acts as a constructor with specific parameters
    public Bugbear(String name, int age, String charclass, String alignment,String race) {
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
        int d121 = dice1.nextInt(12) + 1;
        Random dice2 = new Random();
        int d122 = dice2.nextInt(12) + 1;
        int s = d121 + d122;
        int height = 72 + s;
        int feet = height / 12;
        int inches = height % 12;
        return feet + "\"-" + inches + "\"";
    }

    //This will calculate the weight of a creature based on "dice rolls" and a calculation found in "Volo's Guide to Monsters"
    @Override
    public String Weight() {
        Random dice1 = new Random();
        int d121 = dice1.nextInt(12) + 1;
        Random dice2 = new Random();
        int d122 = dice2.nextInt(12) + 1;
        int s = d121 + d122;
        Random dice3 = new Random();
        int d61 = dice3.nextInt(6) + 1;
        Random dice4 = new Random();
        int d62 = dice4.nextInt(6) + 1;
        int w = d61 + d62;
        return (110 + (s * w)) + " lbs";
    }

    @Override
    public String AbilityScoreIncrease() {
        return "Strength is increased by 2 & Dexterity is increased by 1.";
    }

    @Override
    public String Proficiencies() {
        return "You are proficient in the Stealth skill.";
    }

    //These are the race specific features for Hobgoblins
    @Override
    public String OtherFeatures() {
        return "Long-Limbed: When you make a melee attack on your turn, your reach for it is 5 feet greater than normal.\n" +
                "Powerful Build: You count as one size larger when determining your carrying capacity and the weight you can push, drag, or lift.\n" +
                "Surprise Attack: If you surprise a creature and hit it with an attack on your first turn in combat, the attack deals an extra 2d6 damage to it. You can use this trait only once per combat.";
    }
}
