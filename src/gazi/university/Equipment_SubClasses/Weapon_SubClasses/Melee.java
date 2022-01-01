package gazi.university.Equipment_SubClasses.Weapon_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

import java.util.List;

public class Melee extends Weapon {
    private static List<Melee> listOfMelee;
    private String WeaponName = Melee.class.getName();

    public Melee(){//You do not need to pass any data to a super class b/c it is considered just as a category of a weapon
    }
    public List<Melee> getListOfMelee(){
        return listOfMelee;
    }

    private static void setListOfMelee(Melee melee){
        listOfMelee.add(melee);
    }
}
// DELETE ALL SUBCLASSES OF WEAPONS TODAY AND PROCEED WITH YOUR PROJECT!!!!