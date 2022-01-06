package gazi.university.Location_SubClasses;

import gazi.university.Character;
import gazi.university.Location;
import gazi.university.NPC;
import gazi.university.NPC_SubClasses.ArmorMerchant;
import gazi.university.NPC_SubClasses.WeaponMerchant;
import gazi.university.NPC_SubClasses.PotionMerchant;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TownCenter extends Location {
    private NPC npc;
    private WeaponMerchant weaponMerchant;
    private ArmorMerchant armorMerchant;
    private PotionMerchant potionMerchant;

    // Constructor
    public TownCenter(Character character) {
        super(character);
        this.weaponMerchant = new WeaponMerchant(character);
        this.potionMerchant = new PotionMerchant(character);
    }


    public NPC goToNPC(String npcType) { //returns an instance of NPC's subclass
        String blackName = this.weaponMerchant.getClass().getSimpleName();
        String shopName = this.potionMerchant.getClass().getSimpleName();

        if (npcType.equalsIgnoreCase(blackName)) {
            return this.weaponMerchant;
        } else if (npcType.equalsIgnoreCase(shopName)) {
            return this.potionMerchant;
        }
        return null;
    }


    // Getters and setters for Merchants


    public NPC getNpc() {
        return npc;
    }

    public void setNpc(NPC npc) {
        this.npc = npc;
    }

    public WeaponMerchant getWeaponMerchant() {
        return weaponMerchant;
    }

    public void setWeaponMerchant(WeaponMerchant weaponMerchant) {
        this.weaponMerchant = weaponMerchant;
    }

    public ArmorMerchant getArmorMerchant() {
        return armorMerchant;
    }

    public void setArmorMerchant(ArmorMerchant armorMerchant) {
        this.armorMerchant = armorMerchant;
    }

    public PotionMerchant getPotionMerchant() {
        return potionMerchant;
    }

    public void setPotionMerchant(PotionMerchant potionMerchant) {
        this.potionMerchant = potionMerchant;
    }

    @Override
    public boolean getLocation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Town Center!");

        System.out.println("(You're healed!)");
        System.out.println("Where do you like to go?");
        System.out.println("1 - Weapon Merchant");
        System.out.println("2 - Armor Merchant");
        System.out.println("3 - Potion Merchant");
        System.out.println("4 - Exit");
        try{
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Went to Weapon Merchant.");
                    npc = new WeaponMerchant(getCharacter());
                    npc.decision();
                    break;
                case 2:
                    System.out.println("Went to Armor Merchant.");
                    npc = new ArmorMerchant(getCharacter());
                    npc.decision();
                    break;
                case 3:
                    System.out.println("Went to Potion Merchant.");
                    npc = new PotionMerchant(getCharacter());
                    npc.decision();
                    break;
                case 4:
                    System.out.println("Exited");
                    return true;
                default:
                    System.out.println("Went to Weapon Merchant.");
                    npc = new WeaponMerchant(getCharacter());
                    npc.decision();
                    break;
            }
        }
        catch (Exception exception){
            System.out.println("Wrong input type");

        }

        return true;
    }
}