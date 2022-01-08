package gazi.university;

import gazi.university.Character_SubClasses.Duelist;
import gazi.university.Character_SubClasses.Ranger;
import gazi.university.Character_SubClasses.Sorcerer;
import gazi.university.Location_SubClasses.Battlefield_SubClasses.Level1_CursedCave;
import gazi.university.Location_SubClasses.Battlefield_SubClasses.Level2_DeadDesert;
import gazi.university.Location_SubClasses.Battlefield_SubClasses.Level3_FerociousJungle;
import gazi.university.Location_SubClasses.TownCenter;

import java.util.Scanner;

public class Game {


    Location location;


    public void start() {

        String mName2 = "Main.wav";
        String mName1 = "Battle.wav";
        Music_Adder musicAdder = null;
        Music_Adder musicAdder2 = null;

        try {
            musicAdder = new Music_Adder(mName2);
            musicAdder.Start_Music();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            musicAdder2 = new Music_Adder(mName1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("You're welcome!");
        System.out.println("What do you want your name to be?");
        String initialName = scan.nextLine();
        System.out.println("There are three character classes in this game:");
        System.out.println("1 - Duelist\n2 - Ranger\n3 - Sorcerer");
        System.out.println("With which one you want to play this game?");



        // Making more methods for processes is required.
        // I guess that changing decision from String to int changed something so I'm trying to implement it differently.
        Character player = new Character();

            int characterChoice = scan.nextInt();


            // Selecting character class here
            if (characterChoice == 1) {
                player = new Duelist(initialName, 100, 100, 50, 3, 2, 100, null);
            } else if (characterChoice == 2) {
                player = new Ranger(initialName, 100, 100, 3, 5, 2, 100, null);
            } else if (characterChoice == 3) {
                player = new Sorcerer(initialName, 100, 100, 2, 3, 5, 100, null);
            } else {
                player = new Duelist(initialName, 100, 100, 50, 3, 2, 100, null);
            }


        System.out.println();
        System.out.println("You are a " + player.getClass().getSimpleName() + " from distance lands.");
        System.out.println("Your travels have took you through the most dangerous places on this planet, from the wildest of jungles to the darkest of caves.");
        System.out.println("Upon your travels you arrive a nice little town. Urho.");
        System.out.println("Surrounded by jungles and deserts Urho seems like a nice place to rest a little.");
        System.out.println("And while you are at that why not explore the town and the land thats surrounds it a little bit?...");
        System.out.println();
        System.out.println("Welcome again "  + player.getClass().getSimpleName() + " " +  initialName + "!");
        System.out.println("Select a location to continue.\n");
            while (true) {
                System.out.println(player.getName() + ", lvl " + player.getLvl() + " " + player.getClass().getSimpleName());
                System.out.println("Damage: " + player.getDamage() + ", Defence: " + player.getDefence());
                System.out.println("Has: " + player.getMoney() + " gold");
                System.out.println("Has: " + player.getExperience() + " xp");
                System.out.println("Health: " + player.getHealth());
                System.out.println("Mana: " + player.getMana());


                System.out.println("Where do you like to go?\n");
                System.out.println("1 - Curved Cave");
                System.out.println("2 - Dead Desert");
                System.out.println("3 - Ferocious Jungle");
                System.out.println("4 - Town Center");

                int locationChoice = scan.nextInt();
                while (locationChoice < 0 || locationChoice > 5) {
                    System.out.println("Please select a valid location");
                }
                switch (locationChoice) {
                    case 1:
                        location = new Level1_CursedCave(player);
                        musicAdder.Stop_Music();
                        musicAdder2.Start_Music();

                        break;
                    case 2:
                        location = new Level2_DeadDesert(player);
                        musicAdder.Stop_Music();
                        musicAdder2.Start_Music();
                        break;
                    case 3:
                        location = new Level3_FerociousJungle(player);
                        musicAdder.Stop_Music();
                        musicAdder2.Start_Music();
                    case 4:
                        location = new TownCenter(player);
                        musicAdder2.Stop_Music();
                        musicAdder.Start_Music();
                        break;
                    default:
                        location = new TownCenter(player);
                        musicAdder2.Stop_Music();
                        musicAdder.Start_Music();
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