package gazi.university.Equipment_SubClasses.Weapon_SubClasses;

import gazi.university.Equipment_SubClasses.Weapon;

import java.util.List;

public class Melee extends Weapon {
    private static List<Object> listOfMelee;
    private String WeaponName = Melee.class.getName();
    private String MeleeName;

    public Melee(int Damage, int price) throws ClassNotFoundException {
        Melee melee = new Melee(Damage, price,WeaponName);
    }
    protected Melee(int Damage, int price, String WeaponName) throws ClassNotFoundException {
        super(Damage, price, WeaponName);
        setListOfMelee(this);
    }
    public Melee(){};
    public List<Object> getListOfMelee(){
        return listOfMelee;
    }

    private static void setListOfMelee(Melee melee) throws ClassNotFoundException {
        String MeleeSubClassName = melee.MeleeName;
        Class<?> classCall = Class.forName(MeleeSubClassName);
        Object obj = melee.getClass().cast(classCall);
        listOfMelee.add(obj);
    }
//    @Override
//    public String toString(){
//        if(getListOfMelee().getClass().getName().equals("Axe")){
//            Axe axe = getListOfMelee().;
//        }
//        return "Melee: " + getListOfMelee().getClass().getName() + " " + getListOfMelee().getClass().;
//    }
}
