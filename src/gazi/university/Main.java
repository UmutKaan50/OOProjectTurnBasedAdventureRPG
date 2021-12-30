package gazi.university;

import gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee;
import gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee_SubClasses.Axe;
import gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee_SubClasses.Dagger;
import gazi.university.Equipment_SubClasses.Weapon_SubClasses.Melee_SubClasses.Sword;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        // write your code here
        System.out.println("Hello World!");
        Melee melee;
        Melee melee2;
        Melee melee3;
        melee = new Axe(23, 45);
        melee2 = new Sword(22, 40);
        melee3 = new Dagger(11, 10);

        System.out.println(melee.getListOfMelee().toString());
    }
}
