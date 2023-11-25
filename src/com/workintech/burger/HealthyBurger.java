package com.workintech.burger;

public class HealthyBurger extends Hamburger {
    String healthyExtra1Name;
    String healthyExtra2Name;
    double healthyExtra1Price;
    double healthyExtra2Price;

    public HealthyBurger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, price);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        super.addHamburgerAddition1(name, price);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        super.addHamburgerAddition2(name, price);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        super.addHamburgerAddition3(name, price);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        super.addHamburgerAddition4(name, price);
    }

    @Override
    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    @Override
    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public void itemizeHamburger() {
        double bill = getPrice() + getAddition1Price() + getAddition2Price() + getAddition3Price() + getAddition4Price()  + healthyExtra1Price + healthyExtra2Price;
        String summary = "Summary Order" +
                "\nProduct: " + getName() +
                "\nMeat: " + getMeat() +
                "\nBreadRollType: " + getBreadRollType() +
                "\nPrice: " + getPrice() + "$" +
                "\nAdditions" +
                (Helper.checkValue(getAddition1Name()) ? "\nAddition1: " + getAddition1Name() + " price: " + getAddition1Price() + "$" : "") +
                (Helper.checkValue(getAddition2Name()) ? "\nAddition2: " + getAddition2Name() + " price: " + getAddition2Price() + "$" : "") +
                (Helper.checkValue(getAddition3Name()) ? "\nAddition3: " + getAddition3Name() + " price: " + getAddition3Price() + "$" : "") +
                (Helper.checkValue(getAddition4Name()) ? "\nAddition4: " + getAddition4Name() + " price: " + getAddition4Price() + "$" : "") +
                (Helper.checkValue(healthyExtra1Name) ? "\nHealthyAddition1: " + healthyExtra1Name + " price: " + healthyExtra1Price + "$" : "") +
                (Helper.checkValue(healthyExtra2Name) ? "\nHealthyAddition2: " + healthyExtra2Name + " price: " + healthyExtra2Price + "$" : "")+
                "\nBill = " + bill + "$";
        System.out.println(summary);

    }
}
