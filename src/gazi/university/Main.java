package gazi.university;

import gazi.university.Character_SubClasses.Duelist;
import gazi.university.Character_SubClasses.Ranger;
import gazi.university.Character_SubClasses.Sorcerer;
import gazi.university.Equipment_SubClasses.Weapon;
import gazi.university.Equipment_SubClasses.Weapon_SubClasses.*;
import gazi.university.Location_SubClasses.Battlefield_SubClasses.Level1_CurvedCave;

import java.util.List;
import java.util.*;


public class Main {

    public static void main(String[] args){

        // Rahman's Test ------------------------------------------------------------------
        Weapon weapon = new Weapon();
        //Sword sword = new Sword(23, 44);
        //weapon.addWeaponToList(sword);
        //Axe axe = new Axe(22, 13);
        //weapon.addWeaponToList(axe);
        List<Weapon> weaponList = weapon.getListOfWeapons();
        System.out.println(weaponList.get(0).getClass().getSimpleName());
        System.out.println(weaponList.get(1).getClass().getSimpleName());
        Equipment equipment = new Equipment();
        System.out.println(weaponList.get(0).getClass().getSimpleName());

        equipment.addEquipmentToList(weapon.getListOfWeapons().get(1));
        List<Equipment> equipmentList = equipment.getListOfEquipment();
        System.out.println("This is equipment list: "+ equipmentList.get(0).toString());
        //------------------------------------------------------------

        //Umut Kaan's Test ---------------------------------------------------------------------

        // Yesterday I was thinking about each Character bonus if they equip appropriate item.
        // This makes equiping appropriate item logical I suppose.


        //System.out.println(enemies.get(0).toString());
        // Let's start the game!
        // Please explain what you've added.
        // We can configure it. But first see something concrete.
        Scanner scan = new Scanner(System.in);
        System.out.println("You're welcome!");
        System.out.println("What do you want your name to be?\n");
        String initialName = scan.nextLine();
        System.out.println("There are three character classes in this game:\n");
        System.out.println("1 - Duelist\n2 - Ranger\n3 - Sorcerer");
        System.out.println("With which one you want to play this game?");
        int characterChoice = scan.nextInt();
        // Making more methods for processes is required.
        // I guess that changing decision from String to int changed something so I'm trying to implement it differently.

        Character player = new Character();

        // Selecting character class here
        if (characterChoice == 1){
            player = new Duelist(initialName, 100, 100,50,3,2,10,null);
        }
        if (characterChoice == 2){
            player = new Ranger(initialName, 100, 100,3,5,2,10,null);
        }
        if (characterChoice == 3){
            player = new Sorcerer(initialName, 100, 100,2,3,5,10,null);
        }

        temporaryMessageCall(player);


        // Instantiating Equipments here






    }
    static void temporaryMessageCall(Character player){
        // While loop or exception handling can be added above.
        // I realized that we need to add equipItem and unequipItem methods.
        System.out.println("Have fun, " + player.getClass().getSimpleName() + " " + player.getName());
        System.out.println("Strength: " + player.getStrength());
        System.out.println("");
    }





}
