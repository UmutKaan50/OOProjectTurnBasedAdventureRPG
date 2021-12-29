package gazi.university.Equipment_SubClasses;

import java.util.List;

public class Armor {
    private int flatArmor;
    private int price;
    private String ArmorName;
    private List<Object> listOfArmor;

    public Armor(int flatArmor, int price, String ArmorName) throws ClassNotFoundException {
        this.flatArmor = flatArmor;
        this.price = price;
        this.ArmorName = ArmorName;
        setListOfArmor(this);//We Automatically add an Armor item to the list and should not be set by a user
    }
    public Armor(){} //We created this constructor to not pass any data from its subclasses when we call it

    public List<Object> getListOfArmor() {
        return listOfArmor;
    }

    private void setListOfArmor(Armor armor) throws ClassNotFoundException {
        String type = armor.ArmorName;
        Class<?> classCall = Class.forName("Shield");
        Object obj = armor.getClass().cast(classCall);
        listOfArmor.add(obj);
    }

}
