package gazi.university.Location_SubClasses;

import gazi.university.Character;
import gazi.university.Location;
import gazi.university.NPC;
import gazi.university.NPC_SubClasses.ArmorMerchant;
import gazi.university.NPC_SubClasses.WeaponMerchant;
import gazi.university.NPC_SubClasses.PotionMerchant;

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
        System.out.println("Any other key - Exit");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                npc = new WeaponMerchant(getCharacter());
                npc.decision();
                break;
            case 2:
                npc = new ArmorMerchant(getCharacter());
                npc.decision();
                break;
            case 3:
                npc = new PotionMerchant(getCharacter());
                npc.decision();
                break;
            default:
                npc = new WeaponMerchant(getCharacter());
                npc.decision();
                break;



        }
        return true;
    }
}