package gazi.university;

import gazi.university.Equipment_SubClasses.Weapon;
import gazi.university.Equipment_SubClasses.Weapon_SubClasses.Axe;
import gazi.university.Equipment_SubClasses.Weapon_SubClasses.Sword;

import java.util.List;


public class Main {

    public static void main(String[] args){
        // write your code here

        Weapon weapon = new Weapon();
        Sword sword = new Sword(23, 44);
        weapon.addWeaponToList(sword);
        Axe axe = new Axe(22, 13);
       weapon.addWeaponToList(axe);
       List<Weapon> weaponList = weapon.getListOfWeapons();
       System.out.println(weaponList.get(0).getClass().getSimpleName());
       System.out.println(weaponList.get(1).getClass().getSimpleName());
       Equipment equipment = new Equipment();
       equipment.addItemOfEquipment(weapon, null , null);
       weaponList = equipment.getListOfWeapons();
       System.out.println(weaponList.get(0).getClass().getSimpleName());
    }
}
