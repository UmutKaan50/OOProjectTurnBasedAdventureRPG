package gazi.university.Equipment_SubClasses;

import java.util.List;

public class Weapon {
    private int Damage;
    private int price;
    private List<Object> listOfWeapons;
    private String WeaponName;

    public Weapon(int Damage, int price, String WeaponName) throws ClassNotFoundException {
        this.Damage = Damage;
        this.price = price;
        this.WeaponName = WeaponName;
        this.setListOfWeapons(this);
    }
    public Weapon(){}

    public List<Object> getListOfWeapons(){
        return this.listOfWeapons;
    }
    private void setListOfWeapons(Weapon weapon) throws ClassNotFoundException {
        String type = weapon.WeaponName;
        Class<?> classCall = Class.forName(type);
        Object obj = weapon.getClass().cast(classCall);
        this.listOfWeapons.add(obj);
    }
}
