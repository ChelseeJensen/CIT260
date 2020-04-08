package FinalProject;

/**
 * The Goblinoid class is the parent class in this program. The data members in this class
 * include the name, age, class, and alignment all of which are chosen or selected by the
 * user. This class will house the following methods: Goblinoid(), Goblinoid(Name: String,
 * Age: Int, CLass: String, Alignment: String), getName(): String, setName(Name: String):
 * void, getAge(): Int, setAge(Age: Int): void, getClass(): String, setClass(Class: String):
 * void, getAlignment(): String, setAlignment(Alignment: String): void, height(): double,
 * weight(): double, AbilityScoreIncrease(): String, Proficiencies(): String, Language():
 * String, Speed(): Int, Darkvision(): String, RaceFeatures(): String.
 */

public class Goblinoid {

    /*Data Members*/
    //The Name data member will hold a String value created by the user, naming the character being created
    private String name = "Maglubiyet";
    //The Age data member will hold an Int value chosen by the user
    private int age = 8;
    //The Class data member will hold a class selected by the user
    private String charclass = "Fighter";
    //The Alignment data member will hold an alignment chosen by the user
    private String alignment = "CE";
    private String race;


    /*Method Prologues and Pseudo-code*/
    //This method acts as a constructor
    public Goblinoid(){
    }

    //This method acts as a constructor with specific parameters
    public Goblinoid(String name, int age, String charclass, String alignment, String race) {
        this.name = name;
        this.age = age;
        this.charclass = charclass;
        this.alignment = alignment;
        this.race = race;
    }

    //This is a getter method which will safely retrieve the Name data member
    public String getName() {
        return name;
    }

    //This is a setter method which will safely set the Name data member
    public void setName(String name) {
        this.name = name;
    }

    //This is a getter method which will safely get the Age data member
    public int getAge() {
        return age;
    }

    //This is a setter method which will safely set the Age data member
    public void setAge(int age) {
        this.age = age;
    }

    //This is a getter method which will safely get the Class data member
    public String getCharclass() {
        return charclass;
    }

    //This is a setter method which will safely set the Class data member
    public void setCharclass(String charclass) {
        this.charclass = charclass;
    }

    //This is a getter method which will safely get the Alignment data member
    public String getAlignment() {
        return alignment;
    }

    //This is a setter method which will safely set the Alignment data member
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    //This is a getter method which will safely get the Race data member
    public String getRace() {
        return race;
    }

    //This is a setter method which will safely get the Race data member
    public void setRace(String name) {
        this.race = name;
    }

    //Method will combine data members into one
    public String name() { return getName() + " the " + getAlignment() + " " + getCharclass() + " " + getRace(); }

    //This is a method for Ability Score Improvements that will be overwritten based on race but is set for Goblin.
    public String AbilityScoreIncrease() {
        return "Dexterity is increased by 2 & Constitution is increased by 1.";
    }

    //This is a method for Proficiencies that will be overwritten based on race but is set for Goblin.
    public String Proficiencies() {
        return "None";
    }

    //This is a method for Languages that are shared through all races.
    public String Languages() {
        return "You can speak, read, and write Common and Goblin.";
    }

    //This is a method for Speed that are shared through all races.
    public String Speed() {
        return "Your base walking speed is 30 feet.";
    }

    //This is a method for Darkvision that are shared through all races.
    public String Darkvision() {
        return "You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.";
    }
    public String Height() {
        return "";
    }

    public String Weight() {
        return "";
    }

    public String OtherFeatures() {
        return "";
    }
}
