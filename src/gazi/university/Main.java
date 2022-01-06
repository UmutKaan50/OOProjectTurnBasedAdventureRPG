package gazi.university;

import gazi.university.Character_SubClasses.Duelist;
import gazi.university.Character_SubClasses.Ranger;
import gazi.university.Character_SubClasses.Sorcerer;
import gazi.university.Equipment_SubClasses.Weapon;
import gazi.university.Location_SubClasses.Battlefield_SubClasses.Level1_CurvedCave;
import gazi.university.NPC_SubClasses.WeaponMerchant;

import java.util.List;
import java.util.*;


public class Main {

    public static void main(String[] args){

        // Rahman's Test ------------------------------------------------------------------
        //Weapon weapon = new Weapon("Rahman's weapon");
        //Sword sword = new Sword(23, 44);
        //weapon.addWeaponToList(sword);
        //Axe axe = new Axe(22, 13);
        //weapon.addWeaponToList(axe);

        // Rahman's commented part by Umut Kaan
//        List<Weapon> weaponList = weapon.getListOfWeapons();
//        System.out.println(weaponList.get(0).getClass().getSimpleName());
//        System.out.println(weaponList.get(1).getClass().getSimpleName());
//        Equipment equipment = new Equipment();
//        System.out.println(weaponList.get(0).getClass().getSimpleName());
//
//        equipment.addEquipmentToList(weapon.getListOfWeapons().get(1));
//        List<Equipment> equipmentList = equipment.getListOfEquipment();
//        System.out.println("This is equipment list: "+ equipmentList.get(0).toString());

        //------------------------------------------------------------

        //Umut Kaan's Test ---------------------------------------------------------------------
        // There was an error:
//        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.List.add(Object)" because "this.weaponList" is null
////        at gazi.university.NPC_SubClasses.WeaponMerchant.<init>(WeaponMerchant.java:56)
////        at gazi.university.Main.main(Main.java:74)


        // Yesterday I was thinking about each Character bonus if they equip appropriate item.
        // This makes equiping appropriate item logical I suppose.
        // TODO: Make required changes is Blacksmith class.
        // TODO : ilker abi bilgisayar cümle kur


        //Music adding test

        String mName1 = "DOOM.wav";
        String mName2 = "Main.wav";
        try{
            Music_Adder musicAdder = new Music_Adder(mName2);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        //System.out.println(enemies.get(0).toString());
        // Let's start the game!
        // Please explain what you've added.
        // We can configure it. But first see something concrete.
//            Scanner scan = new Scanner(System.in);
//            System.out.println("You're welcome!");
//            System.out.println("What do you want your name to be?\n");
//            String initialName = scan.nextLine();
//            System.out.println("There are three character classes in this game:\n");
//            System.out.println("1 - Duelist\n2 - Ranger\n3 - Sorcerer");
//            System.out.println("With which one you want to play this game?");
//            int characterChoice = scan.nextInt();
            // Making more methods for processes is required.
            // I guess that changing decision from String to int changed something so I'm trying to implement it differently.


    Game game = new Game();
    game.start();

    }






}
