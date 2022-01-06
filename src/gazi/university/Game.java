package gazi.university;

import gazi.university.Character_SubClasses.Duelist;
import gazi.university.Character_SubClasses.Ranger;
import gazi.university.Character_SubClasses.Sorcerer;
import gazi.university.Location_SubClasses.Battlefield_SubClasses.Level1_CurvedCave;
import gazi.university.Location_SubClasses.Battlefield_SubClasses.Level2_DeadDesert;
import gazi.university.Location_SubClasses.Battlefield_SubClasses.Level3_FerociousJungle;
import gazi.university.Location_SubClasses.TownCenter;

import java.util.Scanner;

public class Game {


    Location location;


    public void start() {

        Scanner scan = new Scanner(System.in);
        System.out.println("You're welcome!");
        System.out.println("What do you want your name to be?");
        String initialName = scan.nextLine();
        System.out.println("There are three character classes in this game:");
        System.out.println("1 - Duelist\n2 - Ranger\n3 - Sorcerer");
        System.out.println("With which one you want to play this game?");
        int characterChoice = scan.nextInt();
        // Making more methods for processes is required.
        // I guess that changing decision from String to int changed something so I'm trying to implement it differently.

        Character player = new Character();

        // Selecting character class here
        if (characterChoice == 1) {
            player = new Duelist(initialName, 100, 100, 50, 3, 2, 10000, null);
        }
        if (characterChoice == 2) {
            player = new Ranger(initialName, 100, 100, 3, 5, 2, 10, null);
        }
        if (characterChoice == 3) {
            player = new Sorcerer(initialName, 100, 100, 2, 3, 5, 10, null);
        }
        System.out.println("Welcome again "  + player.getClass().getSimpleName() + " " +  initialName + "\n");
        System.out.println();
        System.out.println("Select a location to continue.\n");
            while (true) {
                System.out.println(player.getName() + ", " + player.getLvl() + "lvl " + player.getClass().getSimpleName());
                System.out.println("Damage: " + player.getDamage() + ", Defence: " + player.getDefence());
                System.out.println("\nHas: " + player.getMoney() + " gold");


                System.out.println("Where do you like to go?");
                System.out.println("1 - Curved Cave\n");
                System.out.println("2 - Dead Desert\n");
                System.out.println("3 - Ferocious Jungle\n");
                System.out.println("4 - Town Center\n");

                int locationChoice = scan.nextInt();
                while (locationChoice < 0 || locationChoice > 5) {
                    System.out.println("Please select a valid location");
                }
                switch (locationChoice) {
                    case 1:
                        location = new Level1_CurvedCave(player);
                        break;
                    case 2:
                        location = new Level2_DeadDesert(player);
                        break;
                    case 3:
                        location = new Level3_FerociousJungle(player);
                        break;
                    case 4:
                        location = new TownCenter(player);
                        break;
                    default:
                        location = new TownCenter(player);
                        break;
                }

                // In the example project I looked there was this death control I suppose:
                if (!location.getLocation()) {
                    System.out.println("Game Over!");
                    break;
                }

            }
    }
}




//    public void temporaryMessageCall(Character player){
//        // While loop or exception handling can be added above.
//        // I realized that we need to add equipItem and unequipItem methods.
//        System.out.println("Have fun, " + player.getClass().getSimpleName() + " " + player.getName());
//        System.out.println("Strength: " + player.getStrength());
//        System.out.println("");
//
//
//    }