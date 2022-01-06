package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment;
import gazi.university.Equipment_SubClasses.Potion;
import gazi.university.Equipment_SubClasses.Potions_SubClasses.*;
import gazi.university.Equipment_SubClasses.Weapon;
import gazi.university.NPC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PotionMerchant extends NPC {

    private List<Potion> potionList = new ArrayList<Potion>();

    public List<Potion> getPotionList() {
        return potionList;
    }

    public void setPotionList(List<Potion> potionList) {
        this.potionList = potionList;
    }

    HealthPotion hp1 = new HealthPotion("Broken Health Potion",50,50);
    HealthPotion hp2 = new HealthPotion("Normal Health Potion", 100,75);
    HealthPotion hp3 = new HealthPotion("Masterwork Health Potion", 200,100);

    ManaPotion mp1 = new ManaPotion("Broken Mana Potion", 50,50);
    ManaPotion mp2 = new ManaPotion("Normal Mana Potion",100,75);
    ManaPotion mp3 = new ManaPotion("Masterwork Health Potion", 200,100);


    public PotionMerchant(Character character){
        super(character);
        getCharacter().setCurrentLocation(this.getClass().getSimpleName());

        potionList.add(hp1);
        potionList.add(hp2);
        potionList.add(hp3);

        potionList.add(mp1);
        potionList.add(mp2);
        potionList.add(mp3);
    }

    @Override
    public void showInventory() {
        // Maybe we could add item id but I don't think we need it now.
        int counter = 1;
        for (Potion potionItem: potionList){
            System.out.println(counter + " - " + potionItem.getName() + ", " + potionItem.getRegenAmount() +
                    ", " + potionItem.getPrice() + " gold");

            counter++;
        }
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice){

            case 1:
                buyPotion(hp1);
                break;
            case 2:
                buyPotion(hp2);
                break;
            case 3:
                buyPotion(hp3);
                break;
            case 4:
                buyPotion(mp1);
                break;
            case 5:
                buyPotion(mp2);
                break;
            case 6:
                buyPotion(mp3);
                break;
            default:
                break;

        }

    }

    public void buyPotion(Potion potion){

        if(getCharacter().getMoney() >= potion.getPrice()) {

            getCharacter().setMoney(getCharacter().getMoney() - potion.getPrice());
            System.out.println("Bought: " + potion.getName() + "\n");

            if (potion instanceof HealthPotion) {
                if (getCharacter().getHealthPotionEquipped() != null) {
                    //getCharacter().getEquipment().addEquipmentToList(potion);
                    // Instead
                    System.out.println("Previous regen amount: " + getCharacter().getHealthPotionEquipped().getRegenAmount());

                }
                    getCharacter().setHealthPotionEquipped((HealthPotion) potion);
                    System.out.println("Current regen amount: " + getCharacter().getHealthPotionEquipped().getRegenAmount() + "\n\n");



                }
                else if (potion instanceof ManaPotion) {
                if (getCharacter().getManaPotionEquipped() != null) {
                    System.out.println("Previous regen amount: " + getCharacter().getManaPotionEquipped().getRegenAmount());
                } else {
                    getCharacter().setManaPotionEquipped((ManaPotion) potion);
                    System.out.println("Current regen amount: " + getCharacter().getManaPotionEquipped().getRegenAmount());
                }
            }
            System.out.println(getCharacter().getMoney() + " gold left.");
        }
        else
        {
            System.out.println("Not enough money!");
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

        }
        else{

        }
    }
}

