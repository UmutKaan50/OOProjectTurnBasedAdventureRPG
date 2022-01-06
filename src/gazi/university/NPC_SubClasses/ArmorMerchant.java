package gazi.university.NPC_SubClasses;

import gazi.university.Character;
import gazi.university.Equipment_SubClasses.Armor;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.BodyArmor;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Boots;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Helmet;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Shield;
import gazi.university.NPC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmorMerchant extends NPC {

    private List<Armor> armorList = new ArrayList<Armor>();

    public List<Armor> getArmorList() {
        return armorList;
    }

    public void setArmorList(List<Armor> armorList) {
        this.armorList = armorList;
    }
// Umut Kaan's TODO: Configure their values.


    BodyArmor bodyArmor1 = new BodyArmor("Thick Body Armor", 5,100);
    BodyArmor bodyArmor2 = new BodyArmor("Magnificent Body Armor", 10, 200);

    Boots boots1 = new Boots("Thick Boots", 2,50);
    Boots boots2 = new Boots("Magnificent Boots", 5, 150);

    Helmet helmet1 = new Helmet("Thick Helmet", 3, 50);
    Helmet helmet2 = new Helmet("Magnificent Helmet", 6,150);

    Shield shield1 = new Shield("Thick Shield", 5, 100);
    Shield shield2 = new Shield("Magnificent Shield", 10,250);


    public ArmorMerchant(Character character) {
        super(character);

        armorList.add(bodyArmor1);
        armorList.add(bodyArmor2);

        armorList.add(boots1);
        armorList.add(boots2);

        armorList.add(helmet1);
        armorList.add(helmet2);

        armorList.add(shield1);
        armorList.add(shield2);
    }

    @Override
    public void showInventory() {
        System.out.println("Welcome " + getCharacter().getName());
        System.out.println("I have this armors for you!");

        int counter = 1;
        for (Armor armorItem: armorList)
        {
            System.out.println(counter + " - " + armorItem.getName() + ", " + armorItem.getFlatArmor() + ", "
                    + armorItem.getPrice() + " gold");
            counter++;
        }

        System.out.println("Which do you want to buy?");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice){

            case 1:
                buyArmor(bodyArmor1);
                break;
            case 2:
                buyArmor(bodyArmor2);
                break;
            case 3:
                buyArmor(boots1);
                break;
            case 4:
                buyArmor(boots2);
                break;
            case 5:
                buyArmor(helmet1);
                break;
            case 6:
                buyArmor(helmet2);
                break;
            case 7:
                buyArmor(shield1);
                break;
            case 8:
                buyArmor(shield2);
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
            System.out.println("My,\n1 - Body Armor\n2 - Boots\n3 - Helmet\n4 - Shield");
            choice = scan.nextInt();
            if (choice == 1){
                sellArmor(getCharacter().getBodyArmorEquipped());
            }
            else if(choice == 2){
                sellArmor(getCharacter().getBootsEquipped());
            }
            else if(choice == 3){
                sellArmor(getCharacter().getHelmetEquipped());
            }
            else{
                sellArmor(getCharacter().getShieldEquipped());
            }

        }
        else{
            showInventory();

        }
    }

    // Adding armor to armor list of directly equipping it after after buying here.
    public void buyArmor(Armor armor){

        if (getCharacter().getMoney() >= armor.getPrice()){

        getCharacter().setMoney(getCharacter().getMoney() - armor.getPrice());
            System.out.println("Bought: " + armor.getName() + "\n");

        if (armor instanceof BodyArmor){
            if (getCharacter().getBodyArmorEquipped() != null){
                System.out.println("Previous defence from body armor: " + getCharacter().getBodyArmorEquipped().getFlatArmor());
                sellArmor(getCharacter().getBodyArmorEquipped());
            }
                getCharacter().setBodyArmorEquipped((BodyArmor) armor);

        }
        else if (armor instanceof Boots){
            if (getCharacter().getBootsEquipped() != null){
                System.out.println("Previous defence from boots: " + getCharacter().getBootsEquipped().getFlatArmor());
                sellArmor(getCharacter().getBootsEquipped());
            }
                getCharacter().setBootsEquipped((Boots) armor);
        }
        else if (armor instanceof Helmet){
            if(getCharacter().getHelmetEquipped() != null){
                System.out.println("Previous defence from helmet: " + getCharacter().getHelmetEquipped().getFlatArmor());
                sellArmor(getCharacter().getHelmetEquipped());
            }
                getCharacter().setHelmetEquipped((Helmet) armor);
        }
        else if (armor instanceof Shield){
            if (getCharacter().getShieldEquipped() != null){
                System.out.println("Previous defence from shield: " + getCharacter().getShieldEquipped().getFlatArmor());
                sellArmor(getCharacter().getShieldEquipped());
            }
                getCharacter().setShieldEquipped((Shield) armor);
        }
            getCharacter().setDefence(getCharacter().getDefence() + armor.getFlatArmor());
            System.out.println("\nCurrent defence: " + getCharacter().getDefence() + "\n\n");

    }
        else {
            System.out.println("\nNot enough money!\n");
        }
    }

    public void sellArmor(Armor armor){
        if (armor instanceof BodyArmor){
        if (getCharacter().getBodyArmorEquipped() != null) {
            System.out.println(getCharacter().getBodyArmorEquipped().getName() + " is sold.");
            getCharacter().setMoney(getCharacter().getMoney() + (armor.getPrice() - 20));
            System.out.println("Gained: " + (armor.getPrice() - 20) + " gold");
            getCharacter().setBodyArmorEquipped(null);
        }
        else{
            System.out.println("You've nothing to sell me yet.\n");
        }
    }
        else if( armor instanceof Boots){
            if (getCharacter().getBootsEquipped() != null) {
                System.out.println(getCharacter().getBootsEquipped().getName() + " is sold.");
                getCharacter().setMoney(getCharacter().getMoney() + (armor.getPrice() - 20));
                System.out.println("Gained: " + (armor.getPrice() - 20) + " gold");
                getCharacter().setBootsEquipped(null);
            }
            else{
                System.out.println("You've nothing to sell me yet.\n");
            }

        }
        else if (armor instanceof Helmet){
            if (getCharacter().getHelmetEquipped() != null) {
                System.out.println(getCharacter().getHelmetEquipped().getName() + " is sold.");
                getCharacter().setMoney(getCharacter().getMoney() + (armor.getPrice() - 20));
                System.out.println("Gained: " + (armor.getPrice() - 20) + " gold");
                getCharacter().setHelmetEquipped(null);
            }
            else{
                System.out.println("You've nothing to sell me yet.\n");
            }

        }
        else{
            if (getCharacter().getShieldEquipped() != null) {
                System.out.println(getCharacter().getShieldEquipped().getName() + " is sold.");
                getCharacter().setMoney(getCharacter().getMoney() + (armor.getPrice() - 20));
                System.out.println("Gained: " + (armor.getPrice() - 20) + " gold");
                getCharacter().setShieldEquipped(null);
            }
            else{
                System.out.println("You've nothing to sell me yet.\n");
            }

        }

    }



}
