package com.workintech.burger;

public abstract class Hamburger implements Additions {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
    }

    public void itemizeHamburger() {
        double bill = getPrice() + addition1Price + addition2Price + addition3Price + addition4Price;
        String summary = "Summary Order" +
                "\nProduct: " + getName() +
                "\nMeat: " + getMeat() +
                "\nBreadRollType: " + getBreadRollType() +
                "\nPrice: " + getPrice() + "$" +
                "\nAdditions" +
                (Helper.checkValue(addition1Name) ? "\nAddition1: " + addition1Name + " price: " + addition1Price + "$" : "") +
                (Helper.checkValue(addition2Name) ? "\nAddition2: " + addition2Name + " price: " + addition2Price + "$" : "") +
                (Helper.checkValue(addition3Name) ? "\nAddition3: " + addition3Name + " price: " + addition3Price + "$" : "") +
                (Helper.checkValue(addition4Name) ? "\nAddition4: " + addition4Name + " price: " + addition4Price + "$" : "") +
                "\nBill = " + bill+"$";
        System.out.println(summary);

    }
}

