package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment;
import gazi.university.Equipment_SubClasses.*;
import gazi.university.Equipment_SubClasses.Weapon_SubClasses.*;
import gazi.university.NPC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WeaponMerchant extends NPC {

    private List<Weapon> weaponList = new ArrayList<Weapon>();

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    Sword sword1 = new Sword("Heavy Sword", 5, 50);
    Sword sword2 = new Sword("Masterwork Sword", 10, 100);

    Axe axe1 = new Axe("Heavy Axe", 15, 150);
    Axe axe2 = new Axe("Masterwork Axe", 20, 250);

    Bow bow1 = new Bow("Heavy Bow", 5,50);
    Bow bow2 = new Bow("Masterwork Bow", 10, 100);

    Crossbow  crossbow1 = new Crossbow("Heavy CrossBow", 15, 150);
    Crossbow crossbow2 = new Crossbow("Masterwork Crossbow", 20, 250);

    Wand wand1 = new Wand("Heavy Wand", 5, 50);
    Wand wand2 = new Wand("Masterwork Wand", 10, 100);

    Staff staff1 = new Staff("Heavy Staff", 15, 150);
    Staff staff2 = new Staff("Masterwork Staff", 20, 250);

    // "I think them beaing final could be a problem for us. So I omitted that word." -UKO


    @Override
    public void showInventory() {
        int counter = 1;
        System.out.println();
        for (Weapon weaponItem: weaponList)
        {
            System.out.println(counter + " - " + weaponItem.getName() + ", " + weaponItem.getFlatDamage() + ", " +
                    weaponItem.getPrice() + " gold");
            counter++;
        }

        System.out.println("\nYou have " + getCharacter().getMoney() + " gold\nWhich do you want to buy?");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice){
            // Maybe item order can be changed.
            case 1:
                buyWeapon(sword1);
                break;
            case 2:
                buyWeapon(sword2);
                break;
            case 3:
                buyWeapon(axe1);
                break;
            case 4:
                buyWeapon(axe2);
                break;
            case 5:
                buyWeapon(bow1);
                break;
            case 6:
                buyWeapon(bow2);
                break;
            case 7:
                buyWeapon(crossbow1);
                break;
            case 8:
                buyWeapon(crossbow2);
                break;
            case 9:
                buyWeapon(wand1);
                break;
            case 10:
                buyWeapon(wand2);
                break;
            case 11:
                buyWeapon(staff1);
                break;
            case 12:
                buyWeapon(staff2);
                break;
            default:
                break;
        }


    }

    @Override
    public void decision() {
        Scanner scan = new Scanner(System.in);
        System.out.println("I'll,");
        System.out.println("1 - Buy item");
        System.out.println("2 - Sell item");
        int choice = scan.nextInt();
        if (choice == 2){
            sellWeapon(getCharacter().getWeaponEquipped());

        }
        else{
            showInventory();

        }
    }



    // Constructor
    public WeaponMerchant(Character character){ // Blacksmith can accept both all its subclasses and their subclasses' too.
        super(character);

        // Another approach!
        weaponList.add(sword1);
        weaponList.add(sword2);

        weaponList.add(axe1);
        weaponList.add(axe2);

        weaponList.add(bow1);
        weaponList.add(bow2);

        weaponList.add(crossbow1);
        weaponList.add(crossbow2);

        weaponList.add(wand1);
        weaponList.add(wand2);

        weaponList.add(staff1);
        weaponList.add(staff2);


        // I think this part works.
        character.setCurrentLocation(this.getClass().getSimpleName());
    }

    public void buyWeapon(Weapon weapon){

        // If character's money is enough
        if(getCharacter().getMoney() >= weapon.getPrice()){

        getCharacter().setMoney(getCharacter().getMoney() - weapon.getPrice());
            System.out.println("Bought: " + weapon.getName() + "\n");


        if(getCharacter().getWeaponEquipped() != null) {
            System.out.println("Previous damage from weapon: " + getCharacter().getWeaponEquipped().getFlatDamage());
            sellWeapon(getCharacter().getWeaponEquipped());
        }
            getCharacter().setWeaponEquipped(weapon);
            getCharacter().setDamage(getCharacter().getDamage() + weapon.getFlatDamage());
            System.out.println("\nCurrent damage from weapon: " + getCharacter().getWeaponEquipped().getFlatDamage() + "\n\n");

            System.out.println(getCharacter().getMoney() + " gold left.");

        }
        else{
            System.out.println("Not enough money!");

        }
        if (weapon.getClass().getSimpleName() == "Axe" || weapon.getClass().getSimpleName() == "Sowrd" &&
        getCharacter().getClass().getSimpleName() == "Duelist")
        {
            System.out.println("Matched!");
        }

    }

    public void sellWeapon(Weapon weapon){
        if (getCharacter().getWeaponEquipped() != null) {
            System.out.println(getCharacter().getWeaponEquipped().getName() + " is sold.");
            getCharacter().setMoney(getCharacter().getMoney() + (weapon.getPrice() - 20));
            System.out.println("Gained: " + (weapon.getPrice() - 20) + " gold");
            getCharacter().setDamage(getCharacter().getDamage() - weapon.getFlatDamage());
            getCharacter().setWeaponEquipped(null);
        }
        else{
            System.out.println("You've no weapon to sell me yet.\n");
        }
    }



}