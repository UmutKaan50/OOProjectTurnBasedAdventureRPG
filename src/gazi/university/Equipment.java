package gazi.university;

import gazi.university.Equipment_SubClasses.Armor;
import gazi.university.Equipment_SubClasses.Weapon;
import gazi.university.Equipment_SubClasses.Potions;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Equipment {
    // We need to have a list of items by their categories ( Weapon, Armour, Potions)

    private List<Weapon> weapon = new ArrayList<>();
    private List<Armor> armor = new ArrayList<>();
    private List<Potions> potions = new ArrayList<>();

    public Equipment() {
    }

    public List<Weapon> getListOfWeapons() {
        return this.weapon;
    }

    public List<Armor> getListOfArmor() {
        return this.armor;
    }

    public List<Potions> getListOfPotions() {
        return this.potions;
    }

    public void setWeaponToList(Weapon weapon) {
        this.weapon.add(weapon);
    } //just added

    public void setArmorToList(Armor armor) {
        this.armor.add(armor);
    } //just added

    public void setPotionsToList( Potions potions) {
        this.potions.add(potions);
    } //just added

    public void addItemsOfEquipment(@Nullable Weapon weapon, @Nullable Armor armor, @Nullable Potions potions) {
        if (weapon != null) {
            this.weapon = weapon.getListOfWeapons();
        }
        if (armor != null) {
            this.armor = armor.getListOfArmor();
        }
        if (potions != null) {
            this.potions = potions.getListOfPotions();
        }
    }

}
