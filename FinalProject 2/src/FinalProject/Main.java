package FinalProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//This will allow the user input and create a character based upon that input
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //Create a variable for the text file
        String fileName = "characters.txt";

        System.out.println("This program will ask you for name, age, class, and alignment for a D&D 5e goblinoid character." +
                "Upon completion of the requests, the program will write it to a document and will ask if you would like to " +
                "create another character. When you are done creating characters, you can view all the created characters if you wish.\n");

        //Create an ArrayList for the Goblinoid objects
        ArrayList<Goblinoid> Goblinoid = new ArrayList<>();

        String cont = "y";
        //create a while loop for as long as continue = y; then create character
        while (cont.equals("y")) {
            System.out.print("Enter the name of your character: ");
            String name = input.next();

            System.out.print("Enter your character's age (most goblinoids live to be about the same age as humans): ");
            int age = input.nextInt();

            System.out.print("Choose your class (Artificer, Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue, Sorceror, Warlock, Wizard): ");
            String charclass = input.next();

            System.out.print("Choose your alignment (LG, NG, CG, LN, N, CN, LE, NE, CE): ");
            String alignment = input.next();

            System.out.print("Choose your race (Goblin, Hobgoblin, Bugbear): ");
            String race = input.next();
            switch (race) {
                case "Goblin": {
                    Goblinoid object = new Goblin(name, age, charclass, alignment, race);
                    Goblinoid.add(object);
                    break;
                }
                case "Hobgoblin": {
                    Goblinoid object = new Hobgoblin(name, age, charclass, alignment, race);
                    Goblinoid.add(object);
                    break;
                }
                case "Bugbear": {
                    Goblinoid object = new Bugbear(name, age, charclass, alignment, race);
                    Goblinoid.add(object);
                    break;
                }
                default:
                    System.out.print(race + " was not a choice\n");
                    break;
            }

            System.out.print("Do you want to create another character (y or n): ");
            cont = input.next();
        }

        System.out.print("Do you want to view characters (y or n): ");
        String look = input.next();

        if (look.equals("y")) {
            for (int i = 0; i < Goblinoid.size(); i++) {
                try {
                    //Write character info to file
                    WriteFile data = new WriteFile(fileName, true);
                    data.writeToFile(Goblinoid.get(i).name());
                    data.writeToFile("Age: " + Goblinoid.get(i).getAge());
                    data.writeToFile("Height: " + Goblinoid.get(i).Height());
                    data.writeToFile("Weight: " + Goblinoid.get(i).Weight());
                    data.writeToFile("Ability Score: " + Goblinoid.get(i).AbilityScoreIncrease());
                    data.writeToFile("Proficiencies: " + Goblinoid.get(i).Proficiencies());
                    data.writeToFile("Languages: " + Goblinoid.get(i).Languages());
                    data.writeToFile("Speed: " + Goblinoid.get(i).Speed());
                    data.writeToFile("Darkvision: " + Goblinoid.get(i).Darkvision());
                    data.writeToFile(Goblinoid.get(i).OtherFeatures());
                }
                catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

            try {
                //read character info from file and print for the user
                ReadFile file = new ReadFile(fileName);
                String[] arLines = file.OpenFile();

                int i;
                for (i = 0; i < arLines.length; i++) {
                    System.out.println(arLines[i]);
                }
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}