package gazi.university.Equipment_SubClasses;
import java.util.List;

public class Weapon {
    private int Damage;
    private int price;
    private static List<Weapon> listOfWeapons;
    private String WeaponName;

    public Weapon(int Damage, int price, String WeaponName) throws ClassNotFoundException {
        this.Damage = Damage;
        this.price = price;
        this.WeaponName = WeaponName;
        setListOfWeapons(this);
    }
    public Weapon(){}

    public List<Weapon> getListOfWeapons(){
        return listOfWeapons;
    }
    private static void setListOfWeapons(Weapon weapon){
    }
}
