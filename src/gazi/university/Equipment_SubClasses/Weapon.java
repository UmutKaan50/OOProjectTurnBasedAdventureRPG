package gazi.university.Equipment_SubClasses;
import gazi.university.Equipment;
import java.util.ArrayList;
import java.util.List;

public class Weapon extends Equipment {
    // We do not need any variable such as price, Damage, WeaponName because this class is consists of collection of its subclasses
    private  List<Weapon> listOfWeapons = new ArrayList<>();
    private int Damage;
    private int price;

    public Weapon(){}

    @Override
    public List<Weapon> getListOfWeapons(){
        return listOfWeapons;
    }

    public void addWeaponToList(Weapon weapon){
        this.Damage = weapon.getDamage();
        this.price = weapon.getPrice();
        this.listOfWeapons.add(weapon);
    }
    public void removeWeaponFromList(Weapon weapon){ //Added the removal of item
        int index = (int) this.getListOfWeapons().stream().filter(x -> x.getDamage() == weapon.getDamage() && x.getPrice() == weapon.getPrice()
        && x.getClass().getSimpleName().equals(weapon.getClass().getSimpleName())).count();
        this.listOfWeapons.remove(index);
    }
    public int getDamage (){
        return this.Damage;
    }
    public int getPrice(){
        return this.price;
    }
}
