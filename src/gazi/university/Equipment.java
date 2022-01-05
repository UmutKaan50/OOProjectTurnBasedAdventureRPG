package gazi.university;

import gazi.university.Equipment_SubClasses.Armor;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Boots;
import gazi.university.Equipment_SubClasses.Armor_SubClasses.Shield;
import gazi.university.Equipment_SubClasses.Potions_SubClasses.HealthPotion;
import gazi.university.Equipment_SubClasses.Potions_SubClasses.ManaPotion;
import gazi.university.Equipment_SubClasses.Weapon;
import gazi.university.Equipment_SubClasses.Potions;
import gazi.university.Equipment_SubClasses.Weapon_SubClasses.Axe;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Equipment {
    // We need to have a list of items by their categories ( Weapon, Armour, Potions)

    private List<Weapon> weapon = new ArrayList<>();
    private List<Armor> armor = new ArrayList<>();
    private List<Potions> potions = new ArrayList<>();
    private List<Equipment> equipment = new ArrayList<>();

    // Constructor
    public Equipment() {}

    public List<Weapon> getListOfWeapons() {
        return this.weapon;
    }

    public List<Armor> getListOfArmor() {
        return this.armor;
    }

    public List<Potions> getListOfPotions() {
        return this.potions;
    }

    public List<Equipment> getListOfEquipment(){
        return this.equipment;
    }

    public void setWeaponToList(Weapon weapon) {
        this.weapon.add(weapon);
        this.equipment.add(this.weapon.listIterator().next());
    }

    public void setArmorToList(Armor armor) {
        this.armor.add(armor);
        this.equipment.add(this.armor.listIterator().next());
    }

    public void addEquipmentToList(Equipment equipment){ // added equipItem method which accepts any type of equipment and adds to the list equipment

        String itemPackageName = equipment.getClass().getPackageName();
        if(itemPackageName.equals(Axe.class.getPackageName())){
            Weapon weapon = (Weapon) equipment;
            this.setWeaponToList(weapon);
        }else if(itemPackageName.equals(Shield.class.getPackageName())){
            Armor armor = (Armor) equipment;
            this.setArmorToList(armor);
        }else if(itemPackageName.equals(HealthPotion.class.getPackageName())){
            Potions potions = (Potions) equipment;
            this.setPotionsToList(potions);
        }
    }
    public void removeEquipmentFromList(Equipment equipment){ //removes any item in the equipment list
        String itemPackageName = equipment.getClass().getPackageName();

        if(itemPackageName.equals(Axe.class.getPackageName())){
            Weapon weapon = (Weapon) equipment;
            long index = this.weapon.stream().filter(x -> x.getDamage() == weapon.getDamage() && x.getPrice() == weapon.getPrice()
                    && x.getClass().getSimpleName().equals(weapon.getClass().getSimpleName())).count();
            this.weapon.remove((int) index);
        }
        else if(itemPackageName.equals(Boots.class.getPackageName())){
            Armor armor = (Armor) equipment;
            long index = this.armor.stream().filter(x -> x.getFlatArmor() == armor.getFlatArmor() && x.getPrice() == armor.getPrice()
                    && x.getClass().getSimpleName().equals(armor.getClass().getSimpleName())).count();
            this.armor.remove((int) index);
        }
        else if(itemPackageName.equals(ManaPotion.class.getPackageName())){
            Potions potions = (Potions) equipment;
            long index = this.armor.stream().filter(x -> x.getPrice() == potions.getPrice()
                    && x.getClass().getSimpleName().equals(potions.getClass().getSimpleName())).count();
            this.armor.remove((int) index);
        }
    }
    public void setPotionsToList( Potions potions) {
        this.potions.add(potions);
        this.equipment.add(this.potions.listIterator().next());
    }
}
